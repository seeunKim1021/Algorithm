package 반복제어문2;

import java.util.Scanner;

public class Main_137 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        for (int i = 1; i <= n  ; i++) {//행
            for (int j = 1; j <= m ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println();

        }
    }
}
