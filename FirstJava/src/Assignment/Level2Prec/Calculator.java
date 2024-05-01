package Assignment.Level2Prec;
/*3. App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정합니다. (캡슐화)
    - 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현합니다. (Getter 메서드)
    - 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현합니다. (Setter 메서드)
    - 위 요구사항을 모두 구현 했다면 App 클래스의 main 메서드에서 위에서 구현한 메서드를 활용 해봅니다.*/
import java.util.ArrayList;
import java.util.List;

class CalculatorException extends Exception {       // 나눗셈에서 분몬에 0이 들어오거나 연산자 기호가 잘 못 들어온 경우에 대한 예외 클래스
    public CalculatorException(String message) {
        super(message);
    }
}

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드
   private List<Double>results =  new ArrayList<>();

    // 산술 연산을 수행하고 결과 값을 반환하는 메서드
   public double calculator(double firstNum, double secondNum, char operator) throws CalculatorException {
        double result;
       // 연산자 기호에 따라 산술 연산 수행 (향상된 switch)
       switch (operator) {
           case ('+') -> result = firstNum + secondNum;
           case ('-') -> result = firstNum - secondNum;
           case ('*') -> result = firstNum * secondNum;
           case ('/') -> {
               if (secondNum == 0) {
                   throw new CalculatorException("0으로 나눌 수 없음");
               }
               result = firstNum / secondNum;
           }
           default -> throw new CalculatorException("잘못된 연산자 입니다.");
       }
       // 연산 결과를 컬렉션 필드에 저장
       results.add(result);
       return result;
   }
       /* Getter 메서드 구현 */
       public List<Double> getResults() {
           return  new ArrayList<>(results);
       }
       /* Setter 메서드 구현 */
       public void setResult(List<Double> newResults){
           results = new ArrayList<>(newResults);
       }
}