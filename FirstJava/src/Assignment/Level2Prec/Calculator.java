package Assignment.Level2Prec;
/*6. Calculator 인스턴스를 생성(new)할 때 생성자를 통해 연산 결과를 저장하고 있는 컬렉션 필드가 초기화 되도록 수정합니다.*/
import java.util.ArrayList;
import java.util.List;

class CalculatorException extends Exception {       // 나눗셈에서 분모에 0이 들어오거나 연산자 기호가 잘 못 들어온 경우에 대한 예외 클래스
    public CalculatorException(String message) {
        super(message);
    }
}

public class Calculator {
   private List<Double> results;
    public Calculator(List<Double> initialResults) {
        this.results = new ArrayList<>(initialResults);
    }

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
    public List<Double> inquiryResults() {      // 연산 결과 리스트를 조회하는 메서드
        return new ArrayList<>(results);
    }
   public void deleteFirstResult() {        // 연산 결과 리스트에서 첫 번째 데이터를 삭제하는 메서드
       if(!results.isEmpty()) {
           results.removeFirst();
       }
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