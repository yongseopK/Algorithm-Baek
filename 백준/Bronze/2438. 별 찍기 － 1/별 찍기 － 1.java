import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count;
        for(int i = 0; i < N; i++) {
            for(count = 0; count <= i; count++)
                System.out.print("*");
            System.out.println();
        }
    }
}