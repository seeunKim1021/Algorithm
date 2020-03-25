package 함수1;

import java.util.Scanner;

public class Main_576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        int m = sc.nextInt();
        int ans = 0;

        if (ch == '+') {
            ans = n + m;

            System.out.println(n + " " + ch + " " + m + " = " + ans);
        } else if (ch == '-') {
            ans = n - m;

            System.out.println(n + " " + ch + " " + m + " = " + ans);
        } else if (ch == '*') {
            ans = n * m;

            System.out.println(n + " " + ch + " " + m + " = " + ans);

        } else if (ch == '/') {
            ans = n / m;

            System.out.println(n + " " + ch + " " + m + " = " + ans);
        } else
            System.out.println(n + " " + ch + " " + m + " = " + 0);

    }
}
