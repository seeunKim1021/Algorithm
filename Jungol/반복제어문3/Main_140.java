package 반복제어문3;

import java.util.Scanner;

public class Main_140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int cnt = 0;
        for (int i = 0; i < 20; i++) {

            arr[i] = sc.nextInt();
            ++cnt;
            if (arr[i] == 0) {
                cnt -= 1;
                break;
            }


        }
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum + " " + (sum / cnt));
    }
}
