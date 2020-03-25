package 반복제어문2;

import java.util.Scanner;

public class Main_546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();


        }
        double avg = (double) sum / n;
        System.out.print("avg : ");
        System.out.printf("%.1f", avg);
        System.out.println();
        if (avg >= 80) {
            System.out.println("pass");
        } else
            System.out.println("fail");


    }
}
