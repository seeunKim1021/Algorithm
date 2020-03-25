package 선택제어문;

import java.util.Scanner;

public class Main_530 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int old=sc.nextInt();

        if(old>=20){
            System.out.println("adult");
        }else{
            System.out.println((20-old)+" years later");
        }
    }
}
