package 배열1;

import java.util.Scanner;

public class Main_157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            n = sc.nextInt();
            if (n == 0)
                break;
            if (n % 5 == 0) {
                cnt++;
                sum += n;
            }

        }

        System.out.println("Multiples of 5 : " + cnt);
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", ((double) sum / cnt));
    }
}
