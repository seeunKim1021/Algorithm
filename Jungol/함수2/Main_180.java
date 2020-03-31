package 함수2;

import java.util.Scanner;

public class Main_180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;

        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < 6; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
