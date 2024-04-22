public class Hello {

    public static void main(String[] args) {
        int score = 100;
        System.out.println("score = " + score);
        score = 90;
        System.out.println("score = " + score);

        final int finalScore = 100;
        System.out.println("finalScore = " + finalScore);

        char grade = 'b';

        int num = 5;
        char ch = '5';

        System.out.println("num = " + num);
        System.out.println("num + '0' = " + (char) (num + '0'));

        System.out.println("ch = " + ch);
        System.out.println("ch - '0'= ");
        System.out.println(ch - '0');

        System.out.println("ch - '0' + 1 = ");
        System.out.println(ch - '0' + 1);

        System.out.println("num + \"\" = " + num + "");
        System.out.println("num + \"\" + \"5\" = " + num + "" + "5");

        System.out.println("ch + \"\" =" + ch + "");
        System.out.println("ch + \"\" + \"8\" = " + ch + "" + "8");

        String str1 = "100";
        String str2 = "3.14";
        String str3 = "8";

        // 문자열 -> 숫자
        System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str1));
        // Integer.parseInt() 은 int 타입만 가능
//         System.out.println("Integer.parseInt(str2) = " + Integer.parseInt(str2)); // Error 발생
        System.out.println("Double.parseDouble(str2) = " + Double.parseDouble(str2));

        // 문자열 -> 문자
        System.out.println("str.charAt(0) = " + str1.charAt(0) + str1.charAt(1) + str1.charAt(2));
        System.out.println("str2.charAt(0) = " + str3.charAt(0));

        String s2 = "" + 7;
        System.out.println("s2 = " + s2);

        String s4 = 7 + 7 + "";
        System.out.println("s4 = " + s4);

        int k = 0, j = 3;

        // 후위 형
        k = j++;
        System.out.println("k = j++;, k = " + k);
        System.out.println("k = j++;, j = " + j);
        // 다르게 표현 가능
//        k = j;
//        j++;
//        System.out.println("k = j++;, k = " + k);
//        System.out.println("k = j++;, j = " + j);

        // 값 초기화
        k = 0;
        j = 3;

        // 전위 형
        k = ++j;
        System.out.println("k = ++j;, k = " + k);
        System.out.println("k = ++j;, j = " + j);
        // 다르게 표현 가능
//        ++j;
//        k = j;
//        System.out.println("k = ++j;, k = " + k);
//        System.out.println("k = ++j;, j = " + j);

        int i = -10;
        i = +i;
        System.out.println("i = +i; = " + i);

        i = -10;
        i = -i;
        System.out.println("i = -i; = " + i);

        int[] arr = new int[]{1, 2, 3, 4, 5};

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
