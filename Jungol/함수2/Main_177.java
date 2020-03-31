package 함수2;

import java.util.Scanner;

public class Main_177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Math.abs(arr[i]);
        }

        System.out.println(sum);
    }
}
