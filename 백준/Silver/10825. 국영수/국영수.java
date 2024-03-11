import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            students.add(new Student(name, kor, eng, math));
        }

        students.sort(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.kor == o2.kor ?
                        o1.eng == o2.eng ?
                                o1.math == o2.math ?
                                        o1.name.compareTo(o2.name) :
                                        o2.math - o1.math :
                                o1.eng - o2.eng :
                        o2.kor - o1.kor;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.name).append('\n');
        }

        System.out.println(sb);
    }
}

class Student {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
