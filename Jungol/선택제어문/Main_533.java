package 선택제어문;

import java.util.Scanner;

public class Main_533 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        int old = sc.nextInt();


        if (a == 'M' && old >= 18) {
            System.out.println("MAN");

        } else if (a == 'F' && old >= 18) {
            System.out.println("WOMAN");
        } else if (a == 'F') {
            System.out.println("GIRL");
        } else
            System.out.println("BOY");
    }

}


