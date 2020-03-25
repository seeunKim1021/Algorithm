package 배열2;

import java.util.Scanner;

public class Main_564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int chArr[] = new int[26];
        boolean flag = true;
        char c;

        do {
            c = sc.next().charAt(0);

            for (int i = 0; i < 26; i++) {
                if (ch[i] == c) {
                    chArr[i]++;
                    break;
                }

                if (i == 25) {
                    if (ch[i] != c) {
                        flag = false;
                    }
                }
            }

        } while (flag);

        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] != 0) {
                System.out.println(ch[i] + " : " + chArr[i]);
            }
        }


    }
}
