import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] queue;
    static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        queue = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "front":
                    System.out.println(front());
                    break;
                case "back":
                    System.out.println(back());
                    break;
            }
        }
    }

    public static void push(int item) {
        queue[size] = item;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int res = queue[0];
            for (int i = 0; i < size - 1; i++) {
                queue[i] = queue[i + 1];
            }
            size--;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (size == 0) {
            return -1;
        } else {
            return queue[0];
        }
    }

    public static int back() {
        if (size == 0) {
            return -1;
        } else {
            return queue[size - 1];
        }
    }
}
