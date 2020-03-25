package 반복제어문1;

import java.util.Scanner;

public class Main_128 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=3;
        int cnt=0;
        while(a!=0){
            if(a%3==0||a%5==0)
            {

            }else
                cnt++;
            a=sc.nextInt();
        }
        System.out.println(cnt);
    }
}
