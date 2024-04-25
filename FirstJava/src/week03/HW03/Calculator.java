package week03.HW03;

// Calculator 클래스 선언
public class Calculator {
    private AbstractOperation operation;

    public Calculator(AbstractOperation operation){
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation){
        this.operation = operation;
    }
    public double calculator(int firstNumber, int secondNumber) {
        double answer = 0;
        answer = operation.operate(firstNumber,secondNumber);
        return answer;
    }
}
