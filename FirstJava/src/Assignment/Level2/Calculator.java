package Assignment.Level2;

import java.util.ArrayList;
import java.util.List;

// 예외 클래스: 0으로 나누거나 잘못된 연산자 기호에 대한 예외를 처리하는 클래스
class CalculatorException extends Exception {
    public CalculatorException(String message) {
        super(message);
    }
}

public class Calculator {
    private List<Double> results; // 연산 결과를 저장하는 컬렉션 타입 필드

    private List<Double> circleAreas; // 원의 넓이 결과를 저장하는 컬렉션 타입 필드

    // Calculator 클래스의 생성자
    public Calculator(List<Double> initialResults) {
        this.results = new ArrayList<>(initialResults);
        this.circleAreas = new ArrayList<>(); // 원의 넓이 결과를 저장하는 컬렉션 초기화
    }

    // 산술 연산을 수행하고 결과 값을 반환하는 메서드
    public double calculate(double num1, double num2, char operator) throws CalculatorException {
        double result;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    throw new CalculatorException("0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
            }
            default -> throw new CalculatorException("잘못된 연산자 기호입니다.");
        }
        results.add(result); // 연산 결과를 컬렉션에 저장
        return result;
    }

    // 원의 넓이를 계산하고 결과를 반환하는 메서드
    public double calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        circleAreas.add(area); // 원의 넓이 결과를 컬렉션에 저장
        return area;
    }

    // 연산 결과 리스트를 반환하는 메서드
    public List<Double> inquiryResults() {
        return new ArrayList<>(results);
    }

    // 원의 넓이 결과 리스트를 반환하는 메서드
    public List<Double> inquiryCircleAreas() {
        return new ArrayList<>(circleAreas);
    }

    // 연산 결과 리스트에서 첫 번째 데이터를 삭제하는 메서드
    public void deleteFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    // 연산 결과 리스트를 반환하는 Getter 메서드
    public List<Double> getResults() {
        return new ArrayList<>(results);
    }

    // 연산 결과 리스트를 설정하는 Setter 메서드
    public void setResults(List<Double> newResults) {
        results = new ArrayList<>(newResults);
    }
}