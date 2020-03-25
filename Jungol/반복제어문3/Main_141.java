package 반복제어문3;

import java.util.Scanner;

public class Main_141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = 0;
        int a = 1;
        while (k < 100) {
            k = n * a;
            if (k > 100)
                break;
            System.out.print(k + " ");
            a++;

            if (k % 10 == 0)
                break;
        }


    }
}
