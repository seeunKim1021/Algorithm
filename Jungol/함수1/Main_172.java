package 함수1;

import java.util.Scanner;

public class Main_172 {
    static int n, k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        square(n);
    }

    private static void square(int n) {

        for (int i = 1; i <= n; i++) {
            k = i;
            for (int j = 0; j < n; j++) {
                System.out.print((k) + " ");
                k += i;
            }
            System.out.println();
        }
    }
}
