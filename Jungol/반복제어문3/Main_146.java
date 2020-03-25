package 반복제어문3;

import java.util.Scanner;

public class Main_146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char ch = 'A';
        int k = 0;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
