package 반복제어문1;

import java.util.Scanner;

public class Main_537 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=1;
        int a=sc.nextInt();
        int sum=0;
        while(num<=a){

            sum+=num;
            num++;
        }
        System.out.println(sum);
    }
}
