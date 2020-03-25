package 반복제어문1;

import java.util.Scanner;

public class Main_633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Korea \n2. USA\n3. Japan\n4. China");
            System.out.print("number? ");

            int a = sc.nextInt();
            System.out.println();
            switch (a) {
                case 1:
                    System.out.println("Seoul");
                    break;
                case 2:
                    System.out.println("Washington");
                    break;
                case 3:
                    System.out.println("Tokyo");
                    break;
                case 4:
                    System.out.println("Beijing");
                    break;
                default:
                    System.out.println("none");

                    break;

            }
            System.out.println();
            if (a != 1 && a != 2 && a != 3 && a != 4)
                break;
        }


    }
}
