package Assignment.Level2;

// 곱셈 연산을 수행하는 MultiplyOperator 클래스
class MultiplyOperator implements Operator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }
}