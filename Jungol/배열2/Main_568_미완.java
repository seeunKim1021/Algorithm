package 배열2;

import java.util.Scanner;

public class Main_568_미완 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[2][2][4];
        int newArr[][] = new int[2][4];
        String str;

        for (int i = 0; i < 2; i++) {
            str = sc.next();
            str = sc.next();
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 4; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                newArr[i][j] = (arr[0][i][j] * arr[1][i][j]);
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
