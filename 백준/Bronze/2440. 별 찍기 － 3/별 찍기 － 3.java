import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        for(int i = 1; i <= N; i++) {    // 삼각형의 높이
            for(int count = N; count >= i; count--) {    // 삼각형의 길이
                System.out.print("*");
            }
            System.out.println();
        }
    }
}