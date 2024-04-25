package Assignment;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int count = 0;
        int index = 0;

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

            // Save result value and update index
            if (count < 10) { // If less than 10 results saved, just increment index
                intArray[index] = result;
                count++;
                index++;
            } else { // If 10 results already saved
                if (index == 10) // If index is at the end, reset it to 0
                    index = 0;
                intArray[index] = result; // Save new result at the last index
                index++; // Move to next index
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String text = sc.nextLine();
            if (text.equals("exit"))
                break;
        }

        System.out.println("저장된 결과값:");
        for (int i = 0; i < count; i++) {
            System.out.println(intArray[i]);
        }
    }
}