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
    }
}