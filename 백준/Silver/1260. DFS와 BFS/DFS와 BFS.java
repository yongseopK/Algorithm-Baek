import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  static boolean[] visited = new boolean[1001];
  static boolean[][] graph = new boolean[1001][1001];

  static Queue<Integer> Q = new LinkedList<>();
  static int N;
  static int M;
  static int V;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    N = Integer.parseInt(sc.next());
    M = Integer.parseInt(sc.next());
    V = Integer.parseInt(sc.next());

    for (int i = 0; i < M; i++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());

      graph[a][b] = true;
      graph[b][a] = true;
    }

    resetVisited();
    DFS(V);

    resetVisited();
    System.out.println();
    BFS(V);
  }
  public static void resetVisited() {
    for (int i = 1; i <= N; i++) {
      visited[i] = false;
    }
  }

  public static void DFS(int num) {
    System.out.print(num + " ");
    visited[num] = true;

    for (int i = 1; i <= N; i++) {

      if (graph[num][i] && !visited[i]) {
        DFS(i);
      }
    }
  }

  public static void BFS(int num) {
    visited[num] = true;
    Q.add(num);

    while (!Q.isEmpty()) {

      int current = Q.poll();
      visited[current] = true;
      System.out.print(current + " ");

      for (int i = 1; i <= N; i++) {
        if (graph[current][i] && !visited[i]) {
          visited[i] = true;
          Q.add(i);
        }
      }
    }
  }
}
