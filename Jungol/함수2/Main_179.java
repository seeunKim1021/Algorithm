package 함수2;

import java.util.Scanner;

public class Main_179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[3];
        for (int i = 0; i < 3; i++) {

            arr[i] = sc.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += arr[i];
        }

        System.out.println(Math.round(sum / 3));

        sum = 0.0;
        for (int i = 0; i < 3; i++) {
            sum += Math.round(arr[i]);
        }

        System.out.println(Math.round(sum / 3));
    }
}
