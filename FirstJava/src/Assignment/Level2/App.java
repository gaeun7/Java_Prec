package Assignment.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 초기 결과값 리스트 생성
        List<Double> initialResults = new ArrayList<>(Arrays.asList(0.0, 0.0));
        // ArithmeticCalculator 및 CircleCalculator 객체 생성
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(initialResults);
        CircleCalculator circleCalculator = new CircleCalculator(initialResults, initialResults);
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 사용자에게 작업 선택 안내
            System.out.println("작업을 선택하세요: ");
            System.out.println("1. 산술 연산 수행");
            System.out.println("2. 원의 넓이 계산");
            System.out.println("3. 저장된 연산 결과 보기");
            System.out.println("4. 저장된 원의 넓이 결과 보기");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // 산술 연산 수행 메소드 호출
                    performArithmetic(arithmeticCalculator, sc);
                    break;
                case 2:
                    // 원의 넓이 계산 메소드 호출
                    calculateCircleArea(circleCalculator, sc);
                    break;
                case 3:
                    // 저장된 연산 결과 보기
                    showResults(arithmeticCalculator.inquiryResults());
                    break;
                case 4:
                    // 저장된 원의 넓이 결과 보기
                    showResults(circleCalculator.inquiryCircleAreas());
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 1, 2, 3 또는 4를 입력하세요.");
            }

            // 계속 진행 여부 확인
            System.out.println("계속 하시겠습니까? (종료하려면 'exit' 입력)");
            String text = sc.next();
            if (text.equals("exit")) {
                break;
            }
        }
        // Scanner 닫기
        sc.close();
    }

    private static void performArithmetic(ArithmeticCalculator calculator, Scanner sc) {
        // 사용자로부터 숫자와 연산자 입력 받기
        System.out.println("첫 번째 숫자를 입력하세요: ");
        double firstNum = sc.nextDouble();
        System.out.println("두 번째 숫자를 입력하세요: ");
        double secondNum = sc.nextDouble();
        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        try {
            // 산술 연산 수행 및 결과 출력
            double result = calculator.calculate(firstNum, secondNum, operator);
            System.out.println("결과: " + result);
        } catch (CalculatorException e) {
            // 오류 발생 시 예외 처리
            System.out.println("오류: " + e.getMessage());
        }
    }

    private static void calculateCircleArea(CircleCalculator calculator, Scanner sc) {
        // 원의 반지름 입력 받기
        System.out.println("원의 반지름을 입력하세요: ");
        double radius = sc.nextDouble();
        // 원의 넓이 계산 및 결과 출력
        double area = calculator.calculateCircleArea(radius);
        System.out.println("원의 넓이: " + area);
    }

    private static void showResults(List<Double> results) {
        // 결과 출력
        System.out.println("저장된 결과: " + results);
    }
}