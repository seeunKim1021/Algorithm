package 함수1;

import java.util.Scanner;

public class Main_171 {

    static int n, ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        System.out.println(sum(n));
    }

    private static int sum(int n) {
        for (int i = 1; i <= n; i++) {
            ans += i;
        }

        return ans;
    }
}
