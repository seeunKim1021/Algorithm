package 선택제어문;

import java.util.Scanner;

public class Main_632 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Integer.MAX_VALUE;

        if (a <= min)
            min = a;
        if (b <= min)
            min = b;
        if (c <= min)
            min = c;

        System.out.println(min);

    }
}
