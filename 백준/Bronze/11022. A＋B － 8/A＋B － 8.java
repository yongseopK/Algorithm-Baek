import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int T = Integer.parseInt(br.nextLine());
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a + b);
        }
    }
}