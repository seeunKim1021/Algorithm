package 함수1;

import java.util.Scanner;

public class Main_578 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        dan(n, m);

    }

    private static void dan(int n, int m) {

        if (n < m) {
            for (int i = n; i <= m; i++) {
                System.out.println("== " + i + "dan ==");
                for (int j = 1; j <= 9; j++) {
                    System.out.print(i + " * " + j + " = ");
                    System.out.printf("%2d", (i * j));
                    System.out.println();

                }
                System.out.println();
            }
        } else {
            for (int i = m; i <= n; i++) {
                System.out.println("== " + i + "dan ==");
                for (int j = 1; j <= 9; j++) {
                    System.out.print(i + " * " + j + " = ");
                    System.out.printf("%2d", (i * j));
                    System.out.println();
                }
                System.out.println();
            }
        }


    }
}
