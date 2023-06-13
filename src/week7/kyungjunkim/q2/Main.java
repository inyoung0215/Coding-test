package week7.kyungjunkim.q2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int maxCapacity = Integer.parseInt(input[0]);
        int queueSize = Integer.parseInt(input[1]);

        LinkedList<String> queue = new LinkedList<>();
        HashSet<String> enrolledStudents = new HashSet<>();

        for (int i = 0; i < queueSize; i++) {
            String studentID = br.readLine();
            if (!enrolledStudents.contains(studentID)) {
                queue.add(studentID);
                enrolledStudents.add(studentID);
            } else {
                queue.remove(studentID);
                queue.add(studentID);
            }
        }

        int enrolledCount = 0;
        for (String studentID : queue) {
            System.out.println(studentID);
            enrolledCount++;
            if (enrolledCount == maxCapacity) {
                break;
            }
        }

        br.close();
    }
}
