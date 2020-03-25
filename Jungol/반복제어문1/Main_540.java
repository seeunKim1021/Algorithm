package 반복제어문1;

import java.util.Scanner;

public class Main_540 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=1;
        while(a!= -1){
            a=sc.nextInt();
            if(a%3==0){
                System.out.println(a/3);
            }
        }
    }
}
