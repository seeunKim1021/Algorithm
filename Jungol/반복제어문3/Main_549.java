package 반복제어문3;

import java.util.Scanner;

public class Main_549 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        for (int i = 1; i <= n; i += 2) {
            if (sum >= n)
                break;

            sum += i;
            cnt++;

        }

        System.out.println(cnt + " " + sum);
    }
}
