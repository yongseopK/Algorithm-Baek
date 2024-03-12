import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        int count = 1;
        int maxCnt = 1;
        int maxIdx = 0;

        for(int i = 1; i < N; i++) {
            if(arr[i - 1] == arr[i]) {
                count++;
            } else {
                count = 1;
            }

            if (maxCnt < count) {
                maxCnt = count;
                maxIdx = i;
            }
        }

        System.out.println(arr[maxIdx]);
    }
}