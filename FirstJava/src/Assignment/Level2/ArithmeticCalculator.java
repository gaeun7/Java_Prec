package Assignment.Level2;

import java.util.List;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator(List<Double> initialResults) {
        super(initialResults);
    }

    @Override
    // 산술 연산을 수행하고 결과를 반환하는 메소드
    public double calculate(double num1, double num2, char operator) throws CalculatorException {
        double result;
        switch (operator) {
            case '+' -> result = num1 + num2; // 덧셈
            case '-' -> result = num1 - num2; // 뺄셈
            case '*' -> result = num1 * num2; // 곱셈
            case '/' -> {
                // 나눗셈 시 예외 처리
                if (num2 == 0) {
                    throw new CalculatorException("Cannot divide by 0."); // 0으로 나눌 수 없음
                }
                result = num1 / num2; // 나눗셈 수행
            }
            default -> throw new CalculatorException("Invalid operator symbol."); // 잘못된 연산자 기호
        }
        results.add(result); // 결과를 리스트에 추가
        return result; // 결과 반환
    }
}