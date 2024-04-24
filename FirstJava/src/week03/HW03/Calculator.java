package week03.HW03;
public class Calculator {
   public double calculator (String operate, int firstNumber, int secondNumber){
       double answer = 0;

       if (operate.equals("+")){
           answer = firstNumber + secondNumber;
       } else if (operate.equals("-")) {
           answer = firstNumber - secondNumber;
       } else if (operate.equals("*")) {
           answer = firstNumber * secondNumber;
       } else if (operate.equals("/")) {
           answer = firstNumber / secondNumber;
       } else if (operate.equals("%")){
           answer = firstNumber % secondNumber;
       }
       return answer;
   }

}
