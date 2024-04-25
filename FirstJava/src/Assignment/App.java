package Assignment;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int count = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt(); //첫 번째 숫자
            System.out.println("두 번째 숫자를 입력하세요:  ");
            int secondNum = sc.nextInt(); // 두 번째 숫자

            sc.nextLine(); // 개행 문자 소비

            int result = 0; // 초기화

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0); // charAt() : String 타입의 데이터(문자열)에서 특정 문자를 char 타입으로 변환할 때 사용하는 함수

            switch (operator) {
                case '+': // 덧셈 연산
                    result = firstNum + secondNum;
                    System.out.println("결과: " + result);
                    break;
                case '-': // 뺄셈 연산
                    result = firstNum - secondNum;
                    System.out.println("결과: " + result);
                    break;
                case '*': // 곱셈 연산
                    result = firstNum * secondNum;
                    System.out.println("결과: " + result);
                    break;
                case '/': // 나눗셈 연산
                    if (secondNum > 0) {
                        result = firstNum / secondNum;
                        System.out.println("결과: " + result);
                        break;
                    } else { //분모에 0을 입력한 경우
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0을 입력할 수 없습니다.");
                    }
                    break; 
                default: 
                    System.out.println("잘못된 연산자입니다.");
            }
            
            if (count < 10) {  //10번 이하의 연산 결과값일 때
                intArray[count++] = result;
            } else if (count >= 10) { //배열 크기를 초과한 경우
              intArray[0] = Integer.parseInt(null);       //0번째 인덱스 값을 없앰
              int[] copyOfInt = Arrays.copyOf(intArray, intArray.length - 1);  //배열 값 재배치
              intArray[count++] = result;  // 새로운 값 마지막 인덱스에 배치,,,
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String text = sc.nextLine();
            if (text.equals("exit"))
                break;
        }
        
        System.out.println("저장된 결과값:");  // 배열에 저장된 결과값 확인하기
        for (int i = 0; i < count; i++) {
            System.out.println(intArray[i]);
        }
    }
}