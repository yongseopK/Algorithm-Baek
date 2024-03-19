import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int[] arr = new int[26];

        Arrays.fill(arr, -1);

        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if(arr[c - 97] == -1) {
                arr[c - 97] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}