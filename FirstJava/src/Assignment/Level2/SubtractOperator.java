package Assignment.Level2;

// 뺄셈 연산을 수행하는 SubtractOperator 클래스
class SubtractOperator implements Operator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}