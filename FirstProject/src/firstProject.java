import java.util.Scanner;

public class firstProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요리 제목을 입력하세요:");
        String recipeName = sc.nextLine();
        System.out.println("별점을 입력하세요. (ex. 3.5)");
        float score = sc.nextFloat();
        sc.nextLine();

        System.out.println("10줄의 요리 레시피를 작성해주세요:");
        String[] recipes = new String[10];
        for (int i = 0; i < 10; i++) {
            recipes[i] = sc.nextLine();
        }

        int scoreNumber = (int) score;
        double percentage = scoreNumber * 100 / 5.0;

        System.out.println("[" + recipeName + "]");
        System.out.println("Rating: " + scoreNumber + " (" + percentage + "%)");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + recipes[i]);
        }
    }
}
