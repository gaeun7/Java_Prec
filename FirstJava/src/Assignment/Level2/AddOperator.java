package Assignment.Level2;

// 덧셈 연산을 수행하는 AddOperator 클래스
class AddOperator implements Operator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}