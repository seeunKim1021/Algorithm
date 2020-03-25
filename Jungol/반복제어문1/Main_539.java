package 반복제어문1;

import java.util.Scanner;

public class Main_539 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1;
        int cnt = 0;
        int sum = 0;


        while (a < 100) {
            a = sc.nextInt();

            sum += a;
            cnt++;
        }


        System.out.println(sum);
        System.out.printf("%.1f",(double)sum/(cnt));

    }
}
