package 함수1;

import java.util.Scanner;

public class Main_575 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 1;
        while (m != 0) {
            ans *= n;
            m--;
        }

        System.out.println(ans);
    }
}
