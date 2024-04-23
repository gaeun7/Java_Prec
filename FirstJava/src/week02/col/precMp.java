package week02.col;
import java.util.HashMap;
import java.util.Map;
public class precMp {
    /* KEY 값은 Unique 해야 함 */
    public static void main(String[] args) {
        Map<String, Integer> intMap = new HashMap<>(); // 선언 및 생성
        //          키 , 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14); // 중복 Key값은 덮어씁니다.
        intMap.put("삼", 15); // 중복 Key값은 덮어씁니다.

        // key 값 전체 출력
        for (String key : intMap.keySet()) {
            System.out.println(key); // 일,이,삼 출력
        }

        // value 값 전체 출력
        for (Integer value : intMap.values()) {
            System.out.println(value); // 11,12,15 출력
        }

        // get()
        System.out.println(intMap.get("삼")); // 15 출력
    }
}
