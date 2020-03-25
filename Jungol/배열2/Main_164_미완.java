package 배열2;

import java.util.Scanner;

public class Main_164_미완 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][3];
        String str;
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            str = sc.next();
            sum = 0;
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }

            System.out.println((i + 1) + "class : " + sum);
        }
    }
}
