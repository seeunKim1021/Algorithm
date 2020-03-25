package 반복제어문1;

import java.util.Scanner;

public class Main_127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;

        while (0 <= n && n <= 100) {

            sum += n;
            cnt++;
            n = sc.nextInt();
        }

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", ((double)sum / cnt));

    }

}
    