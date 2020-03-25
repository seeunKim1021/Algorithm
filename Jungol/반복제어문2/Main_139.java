package 반복제어문2;

import java.util.Scanner;

public class Main_139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        if (a > b) {
            for (int i = 1; i <= 9; i++) {
                for (int j = a; j >= b; j--) {
                    System.out.print(j + " * " + i + " =");
                    System.out.printf(" %2s   ", j * i);

                }
                System.out.println();
            }

        } else {
            for (int i = 1; i <= 9; i++) {
                for (int j = a; j <= b; j++) {
                    System.out.print(j + " * " + i + " =");
                    System.out.printf(" %2s   ", j * i);

                }
                System.out.println();
            }
        }
    }
}
