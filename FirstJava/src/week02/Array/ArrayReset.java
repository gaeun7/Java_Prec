package week02.Array;

import java.util.Arrays;
public class ArrayReset {
    public static void main(String[] args) {
        // 배열 초기화
                //1. 배열에 특정값 대입하며 선언
                int[] intArray = {1, 2, 3, 4, 5};
                String[] stringArray = {"a", "b", "c", "d"};

                //2-1. for문을 통해 값을 대입
                for (int i = 0; i < intArray.length; i++) {
                    intArray[i] = i;
                }

                //2-2. 향상된 for문을 통한 배열 출력
                for (int i : intArray) {
                    System.out.print(i); // 01234
                }

                System.out.println(); // 줄바꿈

                //3. 배열의 주소를 모두 같은값으로 초기화
                Arrays.fill(intArray, 1);//배열의 모든 값을 1로 초기화

                for (int item : intArray) {
                    System.out.print(item);  // 11111
                }
            }
        }

