package 배열1;

import java.util.Scanner;

public class Main_150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] ch = new char[10];

        for (int i = 0; i < 10; i++) {
            ch[i] = sc.next().charAt(0);
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(ch[i] + " ");
        }
    }
}
