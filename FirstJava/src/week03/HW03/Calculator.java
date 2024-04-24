package week03.HW03;

// Calculator 클래스 선언
public class Calculator {
    // AddOperation, SubstractOperation, MultiplyOperation, DivideOperation 타입의 변수 선언
    // 이 변수들은 각각 더하기, 빼기, 곱하기, 나누기 연산을 수행하는 객체를 참조합니다.
    private final AddOperation addOperation; // 클래스 내에 AddOperation 타입의 변수 addOperation을 선언
    private final SubstractOperation substractOperation; // SubstractOperation 타입의 변수 substractOperation 선언
    private final MultiplyOperation multiplyOperation; // MultiplyOperation 타입의 변수 multiplyOperation 선언
    private final DivideOperation divideOperation; // DivideOperation 타입의 변수 divideOperation 선언

    // 생성자(Constructor) 선언
    // Calculator 클래스의 객체를 생성할 때 필요한 네 가지 연산 객체를 매개변수로 받아 초기화합니다.
    public Calculator(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        // 매개변수로 받은 연산 객체들을 클래스 내부 변수에 저장합니다.
        this.addOperation = addOperation; // addOperation 변수 초기화
        this.substractOperation = substractOperation; // substractOperation 변수 초기화
        this.multiplyOperation = multiplyOperation; // multiplyOperation 변수 초기화
        this.divideOperation = divideOperation; // divideOperation 변수 초기화
    }

    // calculator 메서드 선언
    // 주어진 연산(더하기, 빼기, 곱하기, 나누기, 나머지 구하기)을 수행하고 결과를 반환하는 메서드입니다.
    public double calculator(String operate, int firstNumber, int secondNumber) {
        // 결과를 저장할 변수 선언 및 초기화
        double answer = 0;

        // 주어진 연산에 따라 적절한 연산을 수행합니다.
        if (operate.equals("+")) {
            answer = addOperation.operate(firstNumber, secondNumber); // 더하기 연산 수행
        } else if (operate.equals("-")) {
            answer = substractOperation.operate(firstNumber, secondNumber); // 빼기 연산 수행
        } else if (operate.equals("*")) {
            answer = multiplyOperation.operate(firstNumber, secondNumber); // 곱하기 연산 수행
        } else if (operate.equals("/")) {
            answer = divideOperation.operate(firstNumber, secondNumber); // 나누기 연산 수행
        } else if (operate.equals("%")) {
            answer = firstNumber % secondNumber; // 나머지 구하기 연산 수행
        }

        // 연산 결과 반환
        return answer;
    }
}
