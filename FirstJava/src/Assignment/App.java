package Assignment;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int firstnum = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요:  ");
        int secondnum = sc.nextInt();

        sc.nextLine();

        System.out.println("사칙연산 기호를 입력하세요: ");
        String operator = String.valueOf(sc.nextLine().charAt(0));

        System.out.println("첫 번째 숫자: " + firstnum + "두 번째 숫자: " + secondnum + "연산기호: " + operator); // 입력 받은 변수가 잘 저장 되었는지 확인

    }
}
