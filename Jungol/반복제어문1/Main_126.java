package 반복제어문1;

import java.util.Scanner;

public class Main_126 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=1;
        int oddsum=0;
        int evensum=0;

        while(a!=0){
            a=sc.nextInt();

            if(a!=0&&a%2==0){
                evensum++;

            }else if(a%2==1) {
                oddsum++;
            }

        }


        System.out.println("odd : "+oddsum);
        System.out.println("even : "+evensum);
    }
}
