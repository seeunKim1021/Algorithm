package 연산자;

import java.util.Scanner;

public class Main_115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aHeight = sc.nextInt();
        int aWeight = sc.nextInt();
        int bHeight = sc.nextInt();
        int bWeight = sc.nextInt();

        if (aHeight > bHeight && aWeight > bWeight)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
