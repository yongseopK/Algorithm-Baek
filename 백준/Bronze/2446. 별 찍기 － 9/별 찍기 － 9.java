import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        for(int i = N; i >= 1; i--) {
            for(int blank = 1; blank <= N - i; blank++){    // 앞 공백
                System.out.print(" ");
            }
            for(int count = 0; count < 2 * i - 1; count++) {    // 삼각형의 길이
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i = 2; i <= N; i++) {    // 삼각형의 높이
            for(int blank = 1; blank <= N - i; blank++){    // 앞 공백
                System.out.print(" ");
            }
            for(int count = 0; count < 2 * i - 1; count++) {    // 삼각형의 길이
                System.out.print("*");
            }

            System.out.println();
        }
    }
}