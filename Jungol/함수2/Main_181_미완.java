package 함수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_181_미완 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        st.nextToken();
        st.nextToken();
        double a = Double.parseDouble(st.nextToken());
        final double pi = 3.141592;
        one(a, pi);

    }

    private static void one(double a, double pi) {
        System.out.printf("area = %.3f", pi * a * a);
    }


}
