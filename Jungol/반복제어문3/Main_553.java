package 반복제어문3;

import java.util.Scanner;

public class Main_553 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char ch = 'A';

        for (int j = 0; j < n; j++) {
            for (int i = n; i > j; i--) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
