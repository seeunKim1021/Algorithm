package 함수2;

import java.util.Scanner;

public class Main_581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (Math.abs(n) > Math.abs(m))
            System.out.println(n);
        else
            System.out.println(m);

        double k = sc.nextDouble();
        double l = sc.nextDouble();

        if (Math.abs(k) < Math.abs(l))
            System.out.printf("%.2f", k);

        else
            System.out.printf("%.2f", l);
    }
}
