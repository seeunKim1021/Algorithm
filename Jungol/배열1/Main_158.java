package 배열1;

import java.util.Scanner;

public class Main_158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[100];

        while (n != 0) {

            if (n % 2 == 1) {
                arr[cnt] = 2 * n;
            } else
                arr[cnt] = n / 2;

            cnt++;
            n = sc.nextInt();


        }

        System.out.println(cnt);
        for (int i = 0; i < cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
