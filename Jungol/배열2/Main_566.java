package 배열2;

import java.util.Scanner;

public class Main_566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[100];

        arr[0] = 100;
        arr[1] = n;
        System.out.print(arr[0] + " " + arr[1] + " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i + 2] = arr[i] - arr[i + 1];
            System.out.print(arr[i + 2] + " ");
            if (arr[i + 2] < 0)
                break;
        }


    }
}
