package Assignment;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int firstnum = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요:  ");
        int secondnum = sc.nextInt();
        if (firstnum <= 0 || secondnum <= 0){
            System.out.println("양의 정수를 입력해주세요.");
        }

        sc.nextLine();

        System.out.println("사칙연산 기호를 입력하세요: ");
        char operator = sc.nextLine().charAt(0);

        int result = 0;

        switch (operator){
            case '+':
                result = firstnum + secondnum;
                System.out.println("결과: " + result);
                break;
            case '-':
                result = firstnum - secondnum;
                System.out.println("결과: " + result);
                break;
            case '*':
                result = firstnum * secondnum;
                System.out.println("결과: " + result);
                break;
            case '/':
                if (secondnum > 0) {
                    result = firstnum / secondnum;
                    System.out.println("결과: " + result);
                    break;
                }
                else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0을 입력할 수 없습니다.");
                }
            default:
        }
    }
}
