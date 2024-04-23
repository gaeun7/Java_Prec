package week02.col;
import java.util.LinkedList;
public class LinkedLi {
    /*
    linked list
    메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담아놔요.
    실제 값이 잇는 주소값으로 목록을 구성하고 저장하는 자료구조.
    
    기본적 기능 -> ArrayList와 동일
    LinkedList는 값 -> 여기 저기 나누어서 : 조회하는 속도가 "느림"
    값을 추가하거나, 삭제할 때는 빠름
    */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(); // 선언 및 생성

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList.get(0)); // 1 출력
        System.out.println(linkedList.get(1)); // 2 출력
        System.out.println(linkedList.get(2)); // 3 출력
        System.out.println(linkedList.toString()); // [1,2,3] 출력 (속도 느림)

        linkedList.add(2, 4); // 2번 순번에 4 값을 추가합니다.
        System.out.println(linkedList); // [1,2,4,3] 출력

        linkedList.set(1, 10); // 1번순번의 값을 10으로 수정합니다.
        System.out.println(linkedList.get(1)); // 10 출력

        linkedList.remove(1); // 1번순번의 값을 삭제합니다.
        System.out.println(linkedList); // [1,4,3] 출력

        linkedList.clear(); // 전체 값을 삭제합니다.
        System.out.println(linkedList); // [] 출력
    }
}
