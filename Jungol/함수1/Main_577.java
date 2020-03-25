package 함수1;

import java.util.Scanner;

public class Main_577 {
    static int m = 0;
    static int n = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        System.out.println(ans(n, m) + " " + ans2(n, m));


    }

    private static int ans2(int n, int m) {
        if (n > m) {
            m *= 2;

        } else {
            m /= 2;

        }
        return m;
    }

    private static int ans(int n, int m) {

        if (n > m) {
            n /= 2;

        } else {
            n *= 2;

        }
        return n;
    }


}
