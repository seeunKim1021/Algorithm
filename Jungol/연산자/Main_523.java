package 연산자;

import java.util.Scanner;

public class Main_523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " > " + b + " --- true");
        } else
            System.out.println(a + " > " + b + " --- false");

        if (a < b) {
            System.out.println(a + " < " + b + " --- true");

        } else System.out.println(a + " < " + b + " --- false");

        if (a >= b)
            System.out.println(a + " >= " + b + " --- true");
        else
            System.out.println(a + " >= " + b + " --- false");

        if (a <= b)
            System.out.println(a + " <= " + b + " --- true");
        else
            System.out.println(a + " <= " + b + " --- false");
    }
}
