package 배열1;

import java.util.Scanner;

public class Main_559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] score = {0, 85.6, 79.5, 83.1, 80.0, 78.2, 75.0};

        int n = sc.nextInt();
        int m = sc.nextInt();
        double sum = score[n] + score[m];
        System.out.printf("%.1f", sum);

    }
}
