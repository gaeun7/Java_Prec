import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                String cookName = sc.nextLine();
                float score = Float.parseFloat(sc.nextLine());

                String recipe1 = sc.nextLine();
                String recipe2 = sc.nextLine();
                String recipe3 = sc.nextLine();
                String recipe4 = sc.nextLine();
                String recipe5 = sc.nextLine();
                String recipe6 = sc.nextLine();
                String recipe7 = sc.nextLine();
                String recipe8 = sc.nextLine();
                String recipe9 = sc.nextLine();
                String recipe10 = sc.nextLine();

                int scoreNumber = (int) score;
                double percentage = scoreNumber * 100 / 5.0;

                System.out.println("[ " + cookName + " ]");
                System.out.println("별점: " + scoreNumber + " (" + percentage + "%)");
                System.out.println("1. " + recipe1);
                System.out.println("2. " + recipe2);
                System.out.println("3. " + recipe3);
                System.out.println("4. " + recipe4);
                System.out.println("5. " + recipe5);
                System.out.println("6. " + recipe6);
                System.out.println("7. " + recipe7);
                System.out.println("8. " + recipe8);
                System.out.println("9. " + recipe9);
                System.out.println("10. " + recipe10);
            }
        }
