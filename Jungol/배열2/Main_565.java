package 배열2;

import java.util.Scanner;

public class Main_565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int a = sc.nextInt();
        while (a != 0) {

            a = a / 10;

            arr[a]++;
            a = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            if (arr[i] != 0)
                System.out.println(i + " : " + arr[i]);
        }
    }
}
