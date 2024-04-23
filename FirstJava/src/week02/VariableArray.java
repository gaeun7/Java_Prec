package week02;

public class VariableArray {
    public static void main(String[] args) {
        // 가변 배열

// 선언 및 초기화
        int[][] array = new int[3][];
// 배열 원소마다 각기다른 크기로 지정 가능합니다.
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[1];

// 중괄호 초기화할때도 원소배열들의 크기를 각기 다르게 생성 가능합니다.
        int[][] array2 = {
                {10, 20},
                {10, 20, 30, 40},
                {10}
        };
    }
}
