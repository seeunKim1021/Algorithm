package 배열1;

import java.util.Scanner;

public class Main_156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (n != 999) {
            if (n > max)
                max = n;

            if (n < min)
                min = n;

            n = sc.nextInt();
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
