package Assignment.Level2Prec;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Calculator 인스턴스 생성
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            double firstNum = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요:  ");
            double secondNum = sc.nextInt();
            sc.nextLine(); // 개행 문자 소비

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);
            try {
                // Calculator 클래스를 사용하여 계산
                double result = calculator.calculator(firstNum, secondNum, operator);
                System.out.println("결과: " + result);
            } catch (CalculatorException e) { // 계산 중 발생할 수 있는 CalculatorException 처리
                System.out.println("오류: " + e.getMessage());
            }

            System.out.println("저장된 결과를 조회하시겠습니까? (네 입력 시 조회)");
            String inquiry = sc.nextLine();
            if (inquiry.equals("네")){
                // 조회된 결과 출력
                List<Double> results = calculator.inquiryResults();
                System.out.println("저장된 결과: " + results);
            }

            System.out.println("첫 번째 저장된 데이터를 삭제하시겠습니까? (네 입력 시 삭제)");
            String delete = sc.nextLine();
            if (delete.equals("네")) {
                // 연산 결과 중 첫 번째 저장된 데이터 삭제
                calculator.deleteFirstResult();;
                System.out.println("삭제 후 저장된 값: " + calculator.getResults());
            }

            System.out.println("더 계산하시겠습니까? (아니오 입력 시 종료)");
            String text = sc.nextLine();
            if (text.equals("아니오"))
                break;
        }
    }
}