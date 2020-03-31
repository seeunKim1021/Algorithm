package 함수2;

import java.util.Scanner;

public class Main_580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                if (0 < day && day <= 31)
                    System.out.println("OK!");
                else
                    System.out.println("BAD!");

                break;

            case 2:
                if (0 < day && day <= 29)
                    System.out.println("OK!");
                else
                    System.out.println("BAD!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:

                if (0 < day && day <= 30)
                    System.out.println("OK!");
                else
                    System.out.println("BAD!");
                break;
            default:
                break;

        }
    }
}
