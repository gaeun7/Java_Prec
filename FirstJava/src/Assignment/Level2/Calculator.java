package Assignment.Level2;
/*1. 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(+,-,*,/) 기능을 수행한 후
결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다.
    - 나눗셈에서 분모에 0이 들어오거나 연산자 기호가 잘 못 들어온 경우
    적합한 Exception 클래스를 생성하여 throw 합니다. (매개변수로 해당 오류 내용을 전달합니다.)*/

import java.util.ArrayList;
import java.util.List;

// 0으로 나누기나 잘못된 연산자 기호에 대한 예외 클래스
class CalculatorException extends Exception {
    public CalculatorException(String message) {
        super(message);
    }
}

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드
    private List<Double> results = new ArrayList<>();

    // 산술 연산을 수행하고 결과 값을 반환하는 메서드
    public double calculate(double num1, double num2, char operator) throws CalculatorException {
        double result;

        // 연산자 기호에 따라 산술 연산 수행
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // 0으로 나누기 확인
                if (num2 == 0) {
                    throw new CalculatorException("0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
                break;
            default:
                // 잘못된 연산자 기호에 대한 예외 처리
                throw new CalculatorException("잘못된 연산자 기호입니다.");
        }
        // 연산 결과를 컬렉션 필드에 저장
        results.add(result);
        return result;
    }

    // 연산 결과 컬렉션을 반환하는 게터 메서드
    public List<Double> getResults() {
        return results;
    }
}