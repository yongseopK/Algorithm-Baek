import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static ArrayDeque<Integer> deque = new ArrayDeque<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    System.out.println(!deque.isEmpty() ? deque.pollFirst() : "-1");
                    break;
                case "pop_back":
                    System.out.println(!deque.isEmpty() ? deque.pollLast() : "-1");
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    System.out.println(deque.isEmpty() ? "1" : "0");
                    break;
                case "front":
                    System.out.println(!deque.isEmpty() ? deque.peekFirst() : "-1");
                    break;
                case "back":
                    System.out.println(!deque.isEmpty() ? deque.peekLast() : "-1");
                    break;
            }
        }
    }
}
