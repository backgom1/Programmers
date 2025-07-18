package baekjoon.bronze;

import java.io.*;
import java.util.Arrays;

public class AgeSort_10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        Person[] age = new Person[T];
        for (int i = 0; i < T; i++) {
            String[] split = br.readLine().split(" ");
            age[i] = new Person(i + 1, Integer.parseInt(split[0]), split[1]);
        }


        Arrays.sort(age, (o1, o2) -> {
            if (o1.getAge() == o2.getAge()) {
                return o1.getIndex() - o2.getIndex();
            } else {
                return o1.getAge() - o2.getAge();
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Person person : age) {
            sb.append(person.getAge()).append(" ").append(person.getName()).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static class Person {
        private int index;
        private int age;
        private String name;

        public Person(int index, int age, String name) {
            this.index = index;
            this.age = age;
            this.name = name;
        }

        public int getIndex() {
            return index;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}
