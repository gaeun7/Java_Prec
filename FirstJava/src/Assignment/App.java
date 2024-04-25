package Assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요:  ");
            int secondNum = sc.nextInt();

            sc.nextLine(); // 개행 문자 소비

            int result = 0;

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);

            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    System.out.println("결과: " + result);
                    break;
                case '-':
                    result = firstNum - secondNum;
                    System.out.println("결과: " + result);
                    break;
                case '*':
                    result = firstNum * secondNum;
                    System.out.println("결과: " + result);
                    break;
                case '/':
                    if (secondNum > 0) {
                        result = firstNum / secondNum;
                        System.out.println("결과: " + result);
                    } else {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0을 입력할 수 없습니다.");
                    }
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
            }
            /*ArrayList에 연산 결과 저장할 수 있도록 구현*/
            intArray.add(result);
            System.out.println(intArray); //ArrayList에 잘 저장이 되었는지 확인

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (yes 입력 시 삭제)");
            /*“remove”라는 문자열을 입력받으면 가장 먼저 저장된 결과가 삭제될 수 있도록 구현*/
            String answer = sc.nextLine();
            if (answer.equals("yes")) {
                intArray.remove(0);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String text = sc.nextLine();
            if (text.equals("exit"))
                break;
        }
    }
}