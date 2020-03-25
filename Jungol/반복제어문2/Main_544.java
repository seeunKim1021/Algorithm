package 반복제어문2;

import java.util.Scanner;

public class Main_544 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= 100; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
