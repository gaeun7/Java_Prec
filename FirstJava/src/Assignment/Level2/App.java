package Assignment.Level2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        /* 루프 시작 */
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            double firstNum = sc.nextDouble(); // 보다 정확한 계산을 위해 int 대신 double 사용
            System.out.println("두 번째 숫자를 입력하세요: ");
            double secondNum = sc.nextDouble();

            System.out.print("사칙 연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            try {
                // Calculator 클래스를 사용하여 계산 수행
                double result = calculator.calculate(firstNum, secondNum, operator);
                System.out.println("결과: " + result);
            } catch (CalculatorException e) {
                // 계산 중 발생할 수 있는 CalculatorException 처리
                System.out.println("오류: " + e.getMessage());
            }

            // 개행 문자 소비
            sc.nextLine();

            System.out.println("저장된 결과를 조회하시겠습니까? (삭제하려면 'yes'를 입력하세요)");
            String inquiryOption = sc.nextLine();
            if (inquiryOption.equals("yes")) {
                // 조회된 결과 출력
                List<Double> results = calculator.inquiryResults();
                System.out.println("저장된 결과: " + results);
            }

            System.out.println("첫 번째 저장된 데이터를 삭제하시겠습니까? (삭제하려면 'yes'를 입력하세요)");
            String deleteOption = sc.nextLine();
            if (deleteOption.equals("yes")) {
                // 연산 결과 중 첫 번째 저장된 데이터 삭제
                calculator.deleteFirstResult();
                System.out.println("첫 번째 저장된 데이터가 삭제되었습니다.");

                // 연산 결과 중 첫 번째 저장된 데이터 삭제 후의 결과 출력
                System.out.println("삭제 후 저장된 값: " + calculator.getResults());
            }

            System.out.println("더 계산하시겠습니까? (종료하려면 'exit'을 입력하세요)");
            String text = sc.nextLine();
            if (text.equals("exit")) {
                break;
            }
        } /* 루프 종료 */
        sc.close(); // 사용이 끝난 스캐너 닫기
    }
}