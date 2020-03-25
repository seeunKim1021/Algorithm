package 반복제어문2;

import java.util.Scanner;

public class Main_545 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int tcnt = 0;
        int fcnt = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                tcnt++;
                fcnt++;
            } else if (arr[i] % 3 == 0) {
                tcnt++;
            } else if (arr[i] % 5 == 0) {
                fcnt++;

            }
        }

        System.out.println("Multiples of 3 : " + tcnt);
        System.out.println("Multiples of 5 : " + fcnt);
    }
}
