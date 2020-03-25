package 배열2;

import java.util.Scanner;

public class Main_167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            sum=0;
            sum = (arr[i][0] + arr[i][1]);
            System.out.print(sum / 2 + " ");
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            sum=0;
            sum = arr[0][i] + arr[1][i] + arr[2][i] + arr[3][i];
            System.out.print(sum / 4 + " ");
        }

        System.out.println();
        sum=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum / 8);

    }
}
