package 배열1;

import java.util.Scanner;

public class Main_152 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int n = 0;
        int odd = 0;
        int even = 0;

        for (int i = 1; i < 11; i++) {
            n = sc.nextInt();

            if (i % 2 == 0)
                even += n;
            else
                odd += n;
        }
        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}
