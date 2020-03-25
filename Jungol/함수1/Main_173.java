package 함수1;

import java.util.Scanner;

public class Main_173 {
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        System.out.println(minus(n, m));
    }

    private static int minus(int n, int m) {
        if (n > m) {
            return (n * n) - (m * m);
        } else {
            return (m * m) - (n * n);
        }
    }
}
