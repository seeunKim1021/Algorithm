package 배열1;

import java.util.Scanner;

public class Main_562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[11];
        double oddSum = 0;
        int evenSum = 0;
        for (int i = 1; i <= 10; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];

        }
        System.out.println("sum : " + evenSum);
        System.out.printf("avg : %.1f", (oddSum / 5));

    }
}
