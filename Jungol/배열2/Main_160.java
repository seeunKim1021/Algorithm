package 배열2;

        import java.util.Scanner;

public class Main_160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        int n;
        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();

            arr[n]++;

        }

        for (int i = 1; i < 7; i++) {
            System.out.println(i + " : " + arr[i]);
        }
    }
}
