package 연산자;

import java.util.Scanner;

public class Main_524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean c, d;

        c = a != 0;

        d = b != 0;

        System.out.println((c && d) + " " + (c || d));
    }
}
