package week02;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
public class HW02 {
    /*
    - 입력값
    - 저장할 자료구조명을 입력합니다. (List / Set / Map)
    - 내가 좋아하는 요리 제목을 먼저 입력합니다.
    - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 입력합니다.
    - 입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.
    - 출력값
    - 입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
    - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 입력 순서에 맞게 모두 출력해 줍니다.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CollectionName = sc.nextLine();
        String title = sc.nextLine();

        switch(CollectionName){
            case "List":
                ArrayList<String> strList = new ArrayList<>();
                while(true){
                    String text = sc.nextLine();
                    if (Objects.equals(text,"끝") ) {
                        break;
                    }
                    strList.add(text);
                }
                title = "[List로 저장된" + title + "]";
                System.out.println(title);
                for (int i=0; i < strList.size(); i++){
                    int num = i + 1;
                    System.out.println(num + "." + strList.get(i)); //get명령어는 해당 번지의 값을 가져오는 명령어
                }
                break;
            case "Map":
                Map<Integer,String> strMap = new HashMap<>();
                int lineNum = 1;
                while(true){
                    String text = sc.nextLine();
                    if (Objects.equals(text,"끝") ) {
                        break;
                    }
                    strMap.put(lineNum++, text);
                }
                title = "[Map으로 저장된" + title + "]";
                System.out.println(title);
                for (int i=0; i < strMap.size(); i++){
                    int num = i + 1;
                    System.out.println(num + "." + strMap.get(i+1));
                }
                break;
            case "Set":
                LinkedHashSet<String> strSet = new LinkedHashSet<>();
                while(true){
                    String text = sc.nextLine();
                    if (Objects.equals(text,"끝") ) {
                        break;
                    }
                    strSet.add(text);
                }
                title = "[Set으로 저장된" + title + "]";
                System.out.println(title);
                Iterator iterator = strSet.iterator();
                for (int i=0; i < strSet.size(); i++){
                    int num = i + 1;
                    System.out.println(num + "." + iterator.next());
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료구조입니다.");
        }
    }
}
