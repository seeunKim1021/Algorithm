package 배열1;

import java.util.Scanner;

public class Main_155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'J', 'U', 'N', 'G', 'O', 'L'};

        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'J':
                System.out.println("0");
                break;
            case 'U':
                System.out.println("1");
                break;
            case 'N':
                System.out.println("2");
                break;
            case 'G':
                System.out.println("3");
                break;
            case 'O':
                System.out.println("4");
                break;
            case 'L':
                System.out.println("5");
                break;
            default:
                System.out.println("none");
                break;
        }


    }
}
