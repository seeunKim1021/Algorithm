package 입력;

import java.util.Scanner;

public class Main_110 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("yard? ");
        double yard=sc.nextDouble();

        System.out.print(yard+"yard = ");
        System.out.printf("%.1f",(yard*91.44));
        System.out.println("cm");


    }
}
