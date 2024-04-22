import java.util.*;

public class Main {

  static boolean[] visited = new boolean[1001];
  static boolean[][] graph = new boolean[1001][1001];

  static Queue<Integer> Q = new LinkedList<>();

  static int N;
  static int M;
  static int answer;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    N = Integer.parseInt(sc.next());
    M = Integer.parseInt(sc.next());

    for (int i = 0; i < M; i++) {
      int u = Integer.parseInt(sc.next());
      int v = Integer.parseInt(sc.next());

      graph[u][v] = true;
      graph[v][u] = true;
    }

    for(int i =1; i <= N; i++) {
      if(!visited[i]) {
        BFS(i);
        answer++;
      }
    }
    System.out.println(answer);

    sc.close();
  }

  public static void BFS(int num) {
    visited[num] = true;
    Q.add(num);

    while (!Q.isEmpty()) {
      int current = Q.poll();

      for (int i = 1; i <= N; i++) {
        if (graph[current][i] && !visited[i]) {
          visited[i] = true;
          Q.add(i);
        }
      }
    }
  }
}
