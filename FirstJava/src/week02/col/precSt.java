package week02.col;
import java.util.HashSet;
import java.util.Set;
public class precSt {
    /*
    [Set(집합) : 순서 없고, 중복 없음]
    순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
    Set -> 그냥 쓸 수도 있음. 그러나 HashSet, TreeSet 등으로 응용해서 같이 사용 가능
    Set은 생성자가 없는 껍데기라서 바로 생성할 수 없음
    생성자가 존재하는 HashSet을 이용해서 -> Set을 구현할 수 있음
    */
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<Integer>(); // 선언 및 생성

        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(3); // 중복된 값은 덮어씁니다.
        intSet.add(3); // 중복된 값은 덮어씁니다.

        for (Integer value : intSet) {
            System.out.println(value); // 1,2,3 출력
        }

        // contains()
        System.out.println(intSet.contains(2)); // true 출력
        System.out.println(intSet.contains(4)); // false 출력

        // remove()
        intSet.remove(3); // 3 삭제

        for (Integer value : intSet) {
            System.out.println(value); // 1,2 출력
        }
    }
}
