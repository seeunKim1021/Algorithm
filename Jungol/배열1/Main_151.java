package 배열1;

import java.util.Scanner;

public class Main_151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        for (int i = 1; i <= 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println((arr[1] + arr[3] + arr[5]));


    }
}
