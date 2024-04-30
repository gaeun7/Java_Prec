package Assignment.Level2;


// 나눗셈 연산을 수행하는 DivideOperator 클래스
class DivideOperator implements Operator {
    @Override
    public double calculate(double num1, double num2) throws CalculatorException {
        if (num2 == 0) {
            throw new CalculatorException("Cannot divide by 0."); // 0으로 나눌 수 없음
        }
        return num1 / num2;
    }
}