package 배열2;


import java.util.Scanner;

public class Main_166_미완 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[2][2][3];
        int newArr[][] = new int[2][3];
        String str;
        for (int i = 0; i < 2; i++) {
            str = sc.next();
            str = sc.next();
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                newArr[i][j] = (arr[0][i][j] * arr[1][i][j]);
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }


    }
}