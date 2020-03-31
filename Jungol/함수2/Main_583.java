package 함수2;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main_583 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextDouble();
        }

        sort(arr);


        System.out.print((int) Math.ceil(arr[2]) + " ");
        System.out.print((int) Math.floor(arr[0]) + " ");
        System.out.println((int) Math.round(arr[1]));
    }
}
