package Assignment;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int firstnum = sc.nextInt(); //첫 번째 숫자
        System.out.println("두 번째 숫자를 입력하세요:  ");
        int secondnum = sc.nextInt(); // 두 번째 숫자

        sc.nextLine(); // 개행 문자 소비

        int result = 0; // 초기화

        System.out.println("사칙연산 기호를 입력하세요: ");
        char operator = sc.nextLine().charAt(0);

        switch (operator) {
            case '+': // 덧셈 연산
                result = firstnum + secondnum;
                System.out.println("결과: " + result);
                break;
            case '-': // 뺄셈 연산
                result = firstnum - secondnum;
                System.out.println("결과: " + result);
                break;
            case '*': // 곱셈 연산
                result = firstnum * secondnum;
                System.out.println("결과: " + result);
                break;
            case '/': // 나눗셈 연산
                if (secondnum > 0) {
                    result = firstnum / secondnum;
                    System.out.println("결과: " + result);
                    break;
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0을 입력할 수 없습니다.");
                }
            default:
            }
            System.out.println("더 게산하시겠습니까? (exit 입력 시 종료)");
            String text = sc.nextLine();
            if (text.equals("exit"))
                break;
        }
    }
}
