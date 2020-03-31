package 함수2;

import java.util.Scanner;

public class Main_586 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("(" + n + " - " + m + ") ^ 2 = " + Math.round(Math.pow(n - m, 2)));
        System.out.println("(" + n + " + " + m + ") ^ 3 = " + Math.round(Math.pow(n + m, 3)));
    }
}
