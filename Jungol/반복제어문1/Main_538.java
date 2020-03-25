package 반복제어문1;

import java.util.Scanner;

public class Main_538 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=1;

        while(a!=0){
            System.out.print("number? ");
            a=sc.nextInt();
            if(a>0) {
                System.out.println("positive integer");

            } else if (a < 0) {
                System.out.println("negative number");
            }



        }
    }
}
