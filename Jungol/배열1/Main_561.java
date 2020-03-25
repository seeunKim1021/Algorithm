package 배열1;

import java.util.Scanner;

public class Main_561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] >= 100 && arr[i] < min)
                min = arr[i];

            if (arr[i] < 100 && arr[i] > max)
                max = arr[i];
        }

        if (min == Integer.MAX_VALUE)
            min = 100;
        if (max == Integer.MIN_VALUE)
            max = 100;

        System.out.println(max + " " + min);
    }
}
