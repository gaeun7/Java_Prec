package Assignment.Level2;

import java.util.ArrayList;
import java.util.List;

// 0으로 나누기나 잘못된 연산자 기호에 대한 예외 클래스
class CalculatorException extends Exception {
    public CalculatorException(String message) {
        super(message);
    }
}// ⇒ Exception을 사용하여 위의 코드를 사용하지 않고 예외 처리 가능

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
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
    // 연산 결과 리스트에서 첫 번째 데이터를 삭제하는 메서드
    public void deleteFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    // 연산 결과 컬렉션을 간접적으로 가져오는 Getter 메서드
    public List<Double> getResults() {
        return new ArrayList<>(results); // 직접적인 수정을 방지하기 위해 결과의 복사본을 반환
    }

    // 연산 결과 컬렉션을 간접적으로 수정하는 Setter 메서드
    public void setResults(List<Double> newResults) {
        results = new ArrayList<>(newResults); // 직접적인 수정을 방지하기 위해 새로운 리스트로 결과를 대체
    }
}