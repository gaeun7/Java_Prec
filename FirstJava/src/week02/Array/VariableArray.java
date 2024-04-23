package week02.Array;

public class VariableArray {
    public static void main(String[] args) {
        // 가변 배열

/* 선언 및 초기화
        int[][] array = new int[3][];*/
/* 배열 원소마다 각기다른 크기로 지정 가능합니다.
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[1];*/

/* 중괄호 초기화할때도 원소배열들의 크기를 각기 다르게 생성 가능합니다.
        int[][] array2 = {
                {10, 20},
                {10, 20, 30, 40},
                {10}
        };*/

       /*  가변 2차원 배열 조회
        int[][] array = {
                {10, 20, 30},
                {10, 20, 30, 40},
                {10, 20}
        };

        for (int i = 0; i < array.length; i++) { // 1차원 길이
            for (int j = 0; j < array[i].length; j++) { // 2차원 길이
                System.out.println(array[i][j]); // 2중 반복문으로 i, j 인덱스 순회
            }
        }*/

        // 최대값 구하기

        int[] arr = { 3, 2, 1, 5, 1 };

        // 최대값 초기값 세팅
        int max = arr[0];

        // 최대값 구하기
        for (int num : arr) {
            if (num > max) { // 반복문 돌면서 나(max)보다 값이 작으면 저장
                max = num;
            }
        }

        // 최대값 5 출력
        System.out.println(max);

    }
}
