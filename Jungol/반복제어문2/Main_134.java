package 반복제어문2;

import java.util.Scanner;

public class Main_134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        int n = 0;
        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();

            if (n % 2 == 0)
                even++;
            else
                odd++;


        }

        System.out.println("even : " + even);
        System.out.println("odd : " + odd);
    }
}
