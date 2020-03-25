package 선택제어문;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main_529 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int tall=sc.nextInt();
        int weight=sc.nextInt();
int ans=weight+100-tall;
        System.out.println(ans);

        if(ans>0){
            System.out.println("Obesity");
        }
    }
}
