package week02.Array;

public class ArrayString {
    public static void main(String[] args) {
        /*
        문자(char / 1 byte), 문자열(String)
        String = char []

        [기본형 변수 vs 참조형 변수]
        1. 기본형 변수는 '소문자로 시작함' 반면, 참조형 변수는 '대문자로 시작함'
            - Wrapper class에서 기본현 변수를 감싸줄 때(boxing), int -> Integer
            2. 기본형 변수는 갑 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 저장함(=주소형 변수)

            char < String(훨씬!)
            String이 가지고 있는 기능이 너무 많은
            Wrapper class와도 상다히 비슷 -> 기본형 변수가 가지고 있는 기능이 제한 -> 다양한 기능을 제공하는 Wrapper을 감깜으로써, 추가기능을 더함
        */

        // String 기능 활용하기

        String str = "ABCD";

        // length()
        int strLength = str.length();
        System.out.println(strLength);  // 4 출력

        // charAt(int index)
        char strChar = str.charAt(2); // 순번은 0부터 시작하니까 2순번은 3번째 문자를 가리킵니다.
        System.out.println(strChar);  // C 출력

        // substring(int from, int to)
        String strSub = str.substring(0, 3); // 0~2순번까지 자르기 합니다. (3순번은 제외)
        System.out.println(strSub);  // ABC 출력

        // equals(String str)
        String newStr = "ABCD";  // str 값과 같은 문자열 생성
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual); // true 출력

        // toCharArray()
        char[] strCharArray = str.toCharArray(); // String 을 char[] 로 변환

        // 반대로 char[] 를 String로 변환하는 방법
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray); // char[] 를 String 으로 변환
        System.out.println(charArrayString);
    }
}
