package week02.Array;

public class ArrayPrec {
    public static void main(String[] args) {
       /* 배열 선언 일반적인 선언방식
        int[] intArray;    // 정수 배열
        long[] longArray;
        double[] doubleArray;  // 실수 배열
        char[] charArray;  // 문자 배열
        String[] stringArray; // 문자열 배열
        */

        /* 배열 선언  2번째 선언방식
        int IntArray[];    // 정수 배열 , 위의 변수 명과 겹치지 않도록 대문자로 시작 (위외 소문자처럼 사용하기.)
        long LongArray[];
        double DoubleArray[];  // 실수 배열
        char CharArray[];  // 문자 배열
        String StringArray[]; // 문자열 배열  */

       /*  배열 생성
        //배열 생성후 초기화하면 배열의 주소가 할당된다.
        int[] intArray = new int[3]; // 초기값 {0,0,0}
        boolean[] boolArray = new boolean[3]; // 초기값 {false, false, false}
        String[] stringArray = new String[3]; // 초기값 {"","",""}

        //배열 선언만 해놓고 나중에 초기화를 시킬수도 있다.
        int[] intArray2;
        intArray2 = new int[3]; // 초기값 {0,0,0}*/

       /*  배열 단건조회
        int[] intArray = new int[3]; // 모두 0으로 초기화된 사이즈3의 배열 생성
        // 배열에서 2번쨰 순번의 값을 출력해본다. (0부터 순번이 시작하므로 2번째 순번은 1)
        System.out.println(intArray[1]);*/

        //길이가 8인 정수배열 선언
        int[] intArray = new int[3];

        // 배열이 초기화된 값을 출력해본다.
        // for(int i=0; i<intArray.length; i++)
        for (int j : intArray) { // .length 는 배열의 길이
            System.out.println(j);
        }

    }
}
