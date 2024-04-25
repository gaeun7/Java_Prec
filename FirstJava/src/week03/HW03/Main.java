package week03.HW03;

public class Main {
    public static void main(String[] args) {
        Calculator calculator  = new Calculator(new AddOperation());
        System.out.println(calculator.calculator(10, 20));
        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculator(10,20));
    }
}