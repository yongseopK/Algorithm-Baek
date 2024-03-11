import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Person[] arr = new Person[N];

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            arr[i] = new Person(Integer.parseInt(str[0]), str[1], i); // joinOrder 값 설정
        }

        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.age == p2.age) {
                    return p1.joinOrder - p2.joinOrder;
                } else {
                    return p1.age - p2.age;
                }
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i].age + " " + arr[i].name);
        }
    }
}

class Person {
    int age;
    String name;
    int joinOrder; // 가입 순서

    public Person(int age, String name, int joinOrder) {
        this.age = age;
        this.name = name;
        this.joinOrder = joinOrder;
    }

    // joinOrder getter & setter 메소드
    public int getJoinOrder() {
        return joinOrder;
    }

    public void setJoinOrder(int joinOrder) {
        this.joinOrder = joinOrder;
    }
}