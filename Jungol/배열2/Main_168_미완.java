package 배열2;

import java.util.Scanner;

public class Main_168_미완 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int n=sc.nextInt();

        int arr[][]=new int[n][n+2];

        for (int i = 0; i <n ; i++) {
            arr[i][0]=1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i+j)==(n-1))
                    arr[i][j]=1;
                else arr[i][j]=0;

            }
        }

        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j <n ; j++) {

                if(arr[i][j+1]==0)
                    break;

                arr[i-1][j+1]= arr[i][j]+arr[i][j+1];


            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==0)
                    break;

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
