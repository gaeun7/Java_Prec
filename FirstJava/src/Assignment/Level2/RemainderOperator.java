package Assignment.Level2;

import java.util.List;

// 나머지 연산을 나타내는 ModOperator 인터페이스
interface ModOperator {
    double calculate(double num1, double num2) throws CalculatorException;
}

// RemainderOperator 클래스는 ModOperator 인터페이스를 구현하여 나머지 연산 처리
class RemainderOperator implements ModOperator {
    @Override
    // 나머지 연산을 수행하는 calculate 메소드
    public double calculate(double num1, double num2) throws CalculatorException {
        // 0으로 나누는 경우 예외 처리
        if (num2 == 0) {
            throw new CalculatorException("0으로 나눌 수 없습니다. 다시 입력하세요."); // 0으로 나눌 수 없음
        }
        return num1 % num2; // 나머지 연산 수행
    }
}