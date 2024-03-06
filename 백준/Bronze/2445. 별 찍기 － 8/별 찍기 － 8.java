import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int count = 1; count <= i; count++) {
                System.out.print("*");
            }
            for (int blank = 1; blank <= 2 * (N - i); blank++) {
                System.out.print(" ");
            }
            for (int count = 1; count <= i; count++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = N-1; i > 0; i--) {
            for(int count = 1; count <= i; count++) {
                System.out.print("*");
            }
            for(int blank = 1; blank <= 2 * ( N - i ); blank++) {
                System.out.print(" ");
            }
            for(int count = 1; count <= i; count++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}