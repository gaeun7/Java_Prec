package Assignment.Level2;
import java.util.ArrayList;
import java.util.Scanner;

/* 2. Level 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정합니다.
    - 연산 수행 역할은 Calculator 클래스가 담당합니다.
        - 연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장됩니다.
    - 소스 코드 수정 후에도 수정 전의 기능들이 반드시 똑같이 동작해야합니다. */
public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        /* 루프 시작 */
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            double firstNum = sc.nextDouble(); // 보다 정확한 계산을 위해 int 대신 double 사용
            System.out.println("두 번째 숫자를 입력하세요: ");
            double secondNum = sc.nextDouble();

            System.out.print("사칙 연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            try {
                // Calculator 클래스를 사용하여 계산 수행
                double result = calculator.calculate(firstNum, secondNum, operator);
                System.out.println("결과: " + result);
            } catch (CalculatorException e) {
                // 계산 중 발생할 수 있는 CalculatorException 처리
                System.out.println("오류: " + e.getMessage());
            }

            // 스캐너 버퍼 비우기
            sc.nextLine();

            System.out.println("더 계산하시겠습니까? (종료하려면 'exit'을 입력하세요)");
            String text = sc.nextLine();
            if (text.equals("exit")) {
                break;
            }
        } /* 루프 종료 */
        sc.close(); // 사용이 끝난 스캐너 닫기
    }
}