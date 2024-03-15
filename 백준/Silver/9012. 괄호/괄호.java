import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            boolean isValid = check(str);
            if(isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean check(String str) {
        char[] arr = new char[str.length()];
        int top = -1;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                top++;
                arr[top] = ch;
            } else if (ch == ')') {
                if (top == -1) {
                    return false;
                }
                top--;
            }
        }

        return top == -1;
    }
}
