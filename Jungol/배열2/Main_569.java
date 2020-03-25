package 배열2;

        import java.util.Scanner;

public class Main_569 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum, avg;
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();
            }
            avg = sum / 4;

            if (avg >= 80) {
                cnt++;
                System.out.println("pass");
            } else
                System.out.println("fail");

        }

        System.out.println("Successful : " + cnt);
    }
}
