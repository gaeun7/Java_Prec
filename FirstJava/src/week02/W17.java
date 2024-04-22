package week02;

import java.util.Scanner;

//특정한 단만 출력
public class W17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력한 단을 입력해주세요 : ");
        int n = sc.nextInt();
        for (int i = 2; i <= 9; i++) {
            if (i == n){
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + "곱하기" + j + "는" + (i * j) + "입니다.");
            }
            //break;
            }
        }
    }
}