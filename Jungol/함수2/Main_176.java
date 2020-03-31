package 함수2;

import java.util.Scanner;

public class Main_176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double temp;
        //  System.out.println((int)Math.sqrt((int)n));
        if (n > m) {
            temp = n;
            n = m;
            m = temp;


        }
        int cnt = 0;
        int k = (int) Math.ceil(Math.sqrt(n));
        int l = (int) Math.floor(Math.sqrt(m));

        while (k <= l) {
            cnt++;
            k++;
        }
        System.out.println(cnt);
    }
}
