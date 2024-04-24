package week03.HW03;

public class Main {
    public static void main(String[] args) {
       /* Calculator calculator = new Calculator();*/ //step 1,2
        Calculator calculator  = new Calculator(new AddOperation(), new SubstractOperation(),
                new MultiplyOperation(), new DivideOperation());    // 객체 생성?
        System.out.println(calculator.calculator("+", 10, 20));
        System.out.println(calculator.calculator("*", 10, 20));
    }
}
