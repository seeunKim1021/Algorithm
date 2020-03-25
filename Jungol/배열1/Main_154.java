package 배열1;

import java.util.Scanner;

public class Main_154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += sc.nextDouble();
        }
        System.out.printf("%.1f", sum / 6);

    }
}
