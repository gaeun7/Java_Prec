package Assignment.Level2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Double> initialResults = Arrays.asList(0.0, 0.0);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(initialResults);
        CircleCalculator circleCalculator = new CircleCalculator(initialResults, initialResults);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("작업을 선택하세요: ");
            System.out.println("1. 산술 연산 수행");
            System.out.println("2. 원의 넓이 계산");
            System.out.println("3. 저장된 연산 결과 보기");
            System.out.println("4. 저장된 원의 넓이 결과 보기");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    performArithmetic(arithmeticCalculator, sc);
                    break;
                case 2:
                    calculateCircleArea(circleCalculator, sc);
                    break;
                case 3:
                    showResults(arithmeticCalculator.inquiryResults());
                    break;
                case 4:
                    showResults(circleCalculator.inquiryCircleAreas());
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 1, 2, 3 또는 4를 입력하세요.");
            }

            System.out.println("계속 하시겠습니까? (종료하려면 'exit' 입력)");
            String text = sc.next();
            if (text.equals("exit")) {
                break;
            }
        }
        sc.close();
    }

    private static void performArithmetic(ArithmeticCalculator calculator, Scanner sc) {
        System.out.println("첫 번째 숫자를 입력하세요: ");
        double firstNum = sc.nextDouble();
        System.out.println("두 번째 숫자를 입력하세요: ");
        double secondNum = sc.nextDouble();
        System.out.print("연산자를 입력하세요 (+, -, *, /,%): ");
        char operator = sc.next().charAt(0);
        try {
            double result = calculator.calculate(firstNum, secondNum, operator);
            System.out.println("결과: " + result);
        } catch (CalculatorException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    private static void calculateCircleArea(CircleCalculator calculator, Scanner sc) {
        System.out.println("원의 반지름을 입력하세요: ");
        double radius = sc.nextDouble();
        double area = calculator.calculateCircleArea(radius);
        System.out.println("원의 넓이: " + area);
    }

    private static void showResults(List<Double> results) {
        System.out.println("저장된 결과: " + results);
    }
}