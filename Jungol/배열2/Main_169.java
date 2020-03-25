package 배열2;

        import java.util.Scanner;

public class Main_169 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char chArr[][]=new char[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                chArr[i][j]=sc.next().charAt(0);
                System.out.print((char)((int)chArr[i][j]+32)+" ");
            }
            System.out.println();
        }


    }
}
