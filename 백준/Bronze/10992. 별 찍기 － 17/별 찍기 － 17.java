import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();


        for(int i = 1; i <= N; i++) {
            if(i == N) {
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
                break;
            }
            for(int blank = 1; blank <= N - i; blank++){
                System.out.print(" ");
            }
            for(int count = 1; count <= 2 * i - 1; count++) {
                if(count == 1 || count == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}