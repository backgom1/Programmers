package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CourseRegistration_13414 {

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] command = br.readLine().split(" ");
//        int passStudents = Integer.parseInt(command[0]);
//        int insertStudents = Integer.parseInt(command[1]);
//
//        List<String> students = new ArrayList<>();
//
//        for (int i = 0; i < insertStudents; i++) {
//            String student = br.readLine();
//
//            if (!students.contains(student)) {
//                students.add(student);
//            } else {
//                int index = students.indexOf(student);
//                students.remove(index);
//                students.add(student);
//            }
//        }
//
//        for (int index = 0; index < passStudents; index++) {
//            System.out.println(students.get(index));
//        }
//
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] command = br.readLine().split(" ");
        int passStudents = Integer.parseInt(command[0]);
        int insertStudents = Integer.parseInt(command[1]);

        Map<String, Integer> students = new HashMap<>();
        for (int i = 0; i < insertStudents; i++) {
            String student = br.readLine();
            students.put(student, i);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(students.entrySet());
        entryList.sort(Comparator.comparingInt(Map.Entry::getValue));

        for (int i = 0; i < passStudents && i < entryList.size(); i++) {
            System.out.println(entryList.get(i).getKey());
        }
    }

}
