package 반복제어문3;

import java.util.Scanner;

public class Main_554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 1;
        char ch = 'A';
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {

                System.out.print(a + " ");
                a++;
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
