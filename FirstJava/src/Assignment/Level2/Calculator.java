package Assignment.Level2;

import java.util.List;

// 예외 클래스: 산술 연산에 대한 예외를 처리하는 클래스
class CalculatorException extends Exception {
    public CalculatorException(String message) {
        super(message);
    }
}

public class Calculator {
    protected List<Double> results; // 서브클래스에서 접근할 수 있도록 protected로 변경

    // 생성자: 초기 결과 리스트를 받아와서 설정함
    public Calculator(List<Double> initialResults) {
        this.results = initialResults;
    }

    // 산술 연산을 수행하는 메소드
    public double calculate(double num1, double num2, char operator) throws CalculatorException {
        // 기본 계산기 클래스에서는 지원하지 않는 연산이므로 예외 발생
        throw new CalculatorException("기본 계산기 클래스에서는 지원하지 않는 연산입니다");
    }

    // 결과 리스트를 반환하는 메소드
    public List<Double> inquiryResults() {
        return results;
    }

    // 첫 번째 결과를 삭제하는 메소드
    public void deleteFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}