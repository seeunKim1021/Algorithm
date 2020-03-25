package 배열1;

import java.util.Scanner;


public class Main_560 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println(min);

    }
}
