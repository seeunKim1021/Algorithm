package 반복제어문2;

import java.util.Scanner;

public class Main_543 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 2; i <= n ; i+=2) {
            System.out.print(i+" ");

        }
    }
}
