import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int[][] dp = new int[10001][4];

    int T = Integer.parseInt(br.readLine());

    dp[1][1] = 1;
    dp[2][1] = 1;
    dp[2][2] = 1;
    dp[3][1] = 1;
    dp[3][2] = 1;
    dp[3][3] = 1;

    for(int i = 4; i <= 10000 ; i++) {
      dp[i][1] = dp[i-1][1];
      dp[i][2] = dp[i-2][1] + dp[i-2][2];
      dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3];
    }

    for(int i = 0; i < T; i++) {
      int n = Integer.parseInt(br.readLine());

      sb.append(dp[n][1] + dp[n][2] + dp[n][3]).append("\n");
    }

    System.out.println(sb);
    br.close();
  }
}
