import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        for(int i = 0; i < N; i++) {    // 삼각형의 높이
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