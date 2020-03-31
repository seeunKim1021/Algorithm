package 함수2;

import java.util.Scanner;

public class Main_585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[11];
        int temp, k;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            k = i;
            for (int j = 0; j < 10; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
