package 배열1;

import java.util.Scanner;

public class Main_556 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[11];

        for (int i = 1; i < 11; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }
}
