package 함수1;

import java.util.Scanner;

public class Main_574 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int n;
        for (int i = 0; i < 3; i++) {
            n = sc.nextInt();
            if (n > max)
                max = n;
        }

        System.out.println(max);
    }
}
