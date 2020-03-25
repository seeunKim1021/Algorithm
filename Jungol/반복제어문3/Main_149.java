package 반복제어문3;

import java.util.Scanner;

public class Main_149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(k + " ");

                k += 2;
                if (k > 10)
                    k = 1;
            }
            System.out.println();
        }
    }
}
