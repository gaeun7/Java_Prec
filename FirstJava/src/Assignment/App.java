package Assignment;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int firstnum = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요:  ");
        int secondnum = sc.nextInt();

        System.out.println("첫 번째 숫자: " + firstnum + "두 번째 숫자: " + secondnum); // 입력 받은 변수가 잘 저장 되었는지 확인
    }
}
