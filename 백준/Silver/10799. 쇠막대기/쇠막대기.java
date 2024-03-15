import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String stick = br.readLine();

        int top = 0;
        int ans = 0;

        for (int i = 0; i < stick.length(); i++) {
            char c = stick.charAt(i);

            if(c == '(') {
                top++;
            } else {
                top--;

                if(stick.charAt(i - 1) == '(') {
                    ans += top;
                } else {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
