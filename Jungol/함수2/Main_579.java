package 함수2;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main_579 {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            arr[i] = sc.nextInt();

        }

        sort(arr);
        for (int i = n; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }


}
