package 반복제어문2;

public class Main_548 {
    public static void main(String[] args) {
        for (int i = 2; i <= 4 ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                System.out.print(i+" * "+j+" =");
                System.out.printf("%3s   ",i*j);
            }
            System.out.println();
        }
    }
}
