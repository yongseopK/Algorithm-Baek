import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();
        for(int i = 1; i <= N; i++) {
            for(int blank = 1; blank <= N - i; blank++){
                System.out.print(" ");
            }
            for(int count = 0; count < i; count++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < N; i++) {    // 삼각형의 높이
            for(int blank = N - i; blank < N; blank++){    // 앞 공백
                System.out.print(" ");
            }
            for(int count = i; count < N; count++) {    // 삼각형의 길이
                System.out.print("*");
            }
            System.out.println();
        }
    }
}