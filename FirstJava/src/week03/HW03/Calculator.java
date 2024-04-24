package week03.HW03;
public class Calculator {
    private final AddOperation addOperation; //  클래스 내에 AddOperation 타입의 변수 addOperation을 선언
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    //생성자 매개변수 생성
    public Calculator(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }


    public double calculator (String operate, int firstNumber, int secondNumber){  //calculator라는 메서드를 정의
       double answer = 0;

       if (operate.equals("+")){
           answer = addOperation.operate(firstNumber, secondNumber);
       } else if (operate.equals("-")) {
           answer = substractOperation.operate(firstNumber,secondNumber);
       } else if (operate.equals("*")) {
           answer = multiplyOperation.operate(firstNumber, secondNumber);
       } else if (operate.equals("/")) {
           answer = divideOperation.operate(firstNumber,secondNumber);
       } else if (operate.equals("%")){
           answer = firstNumber % secondNumber;
       }
       return answer;
   }

}
