package 함수1;

import java.util.Scanner;

public class Main_174 {
    static int a, b, c, sum;
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[4][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        ans(arr);
    }

    private static void ans(int[][] arr) {
        //가로
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][3] += arr[i][j];
            }

        }

        //세로
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                arr[3][i] += arr[j][i];
            }

        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
