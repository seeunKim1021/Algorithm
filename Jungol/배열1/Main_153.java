package 배열1;

import java.util.Scanner;

public class Main_153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[101];

        int cnt = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == -1)
                break;

            cnt++;

        }
        if (cnt > 2) {

            for (int i = cnt - 3; i <= cnt - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = 0; i < cnt; i++) {
                System.out.print(arr[i] + " ");
            }

        }
    }
}
