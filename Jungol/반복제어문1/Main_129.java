package 반복제어문1;

import java.util.Scanner;

public class Main_129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int height;
        char y = 'y';

        while (y == 'y' || y == 'Y') {
            System.out.print("Base = ");
            base = sc.nextInt();
            System.out.print("Height = ");
            height = sc.nextInt();
            System.out.println("Triangle width = " + (double) (base * height) / 2);
            System.out.print("Continue? ");
            y = sc.next().charAt(0);
        }
    }
}
