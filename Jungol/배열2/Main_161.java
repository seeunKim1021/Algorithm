package 배열2;

import java.util.Scanner;

public class Main_161 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int score[]=new int[11];

        int n=sc.nextInt();

        while(n!=0){

            n=n/10;

            score[n]++;

            n=sc.nextInt();
        }

        for (int i = 10; i >=0 ; i--) {
            if(score[i]!=0)
                System.out.println(i*10+" : "+score[i]+" person");
        }


    }
}
