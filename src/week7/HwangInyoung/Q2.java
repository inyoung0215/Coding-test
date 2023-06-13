package week7.HwangInyoung;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();

        Map<String, Integer> studentMap = new LinkedHashMap<>();

        for (int i = 0; i < l; i++) {
            String student = scanner.next();
            studentMap.put(student, i);
        }

        int count = 0;
        for (int i = 0; i < l; i++) {
            for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
                if (entry.getValue() == i) {
                    System.out.println(entry.getKey());
                    count++;
                }
                if (count == k) {
                    break;
                }
            }
        }
    }
}
