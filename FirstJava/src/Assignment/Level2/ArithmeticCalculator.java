package Assignment.Level2;

import java.util.ArrayList;
import java.util.List;

// 연산자 인터페이스: calculate 메소드를 정의함
interface Operator {
    double calculate(double num1, double num2) throws CalculatorException;
}

// 산술 연산을 위한 ArithmeticCalculator 클래스
public class ArithmeticCalculator extends Calculator {
    private final Operator addOperator; // 덧셈 연산자
    private final Operator subtractOperator; // 뺄셈 연산자
    private final Operator multiplyOperator; // 곱셈 연산자
    private final Operator divideOperator; // 나눗셈 연산자
    private final ModOperator modOperator; // 나머지 연산자

    // 생성자: 초기 결과 리스트를 받아와서 설정하고 연산자 객체들을 초기화함
    public ArithmeticCalculator(List<Double> initialResults) {
        super(new ArrayList<>(initialResults));
        this.addOperator = new AddOperator(); // 덧셈 연산자 초기화
        this.subtractOperator = new SubtractOperator(); // 뺄셈 연산자 초기화
        this.multiplyOperator = new MultiplyOperator(); // 곱셈 연산자 초기화
        this.divideOperator = new DivideOperator(); // 나눗셈 연산자 초기화
        this.modOperator = new RemainderOperator(); // 나머지 연산자 초기화
    }

    // 산술 연산을 수행하는 메소드
    public double calculate(double num1, double num2, char operator) throws CalculatorException {
        double result;
        switch (operator) {
            case '+':
                result = addOperator.calculate(num1, num2); // 덧셈 연산 수행
                break;
            case '-':
                result = subtractOperator.calculate(num1, num2); // 뺄셈 연산 수행
                break;
            case '*':
                result = multiplyOperator.calculate(num1, num2); // 곱셈 연산 수행
                break;
            case '/':
                result = divideOperator.calculate(num1, num2); // 나눗셈 연산 수행
                break;
            case '%':
                result = modOperator.calculate(num1, num2); // 나머지 연산 수행
                break;
            default:
                throw new CalculatorException("잘못된 연산자 기호입니다. 다시 입력하세요."); // 잘못된 연산자 기호
        }
        results.add(result); // 결과를 리스트에 추가
        return result; // 결과 반환
    }
}