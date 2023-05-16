package week4;

import java.util.LinkedList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            LinkedList<Document> queue = new LinkedList<>();

            for (int j = 0; j < n; j++) {
                int priority = scanner.nextInt();
                queue.add(new Document(j, priority));
            }

            int count = 0;
            while (!queue.isEmpty()) {
                Document current = queue.poll();
                boolean isPrinted = true;

                for (Document doc : queue) {
                    if (doc.priority > current.priority) {
                        queue.add(current);
                        isPrinted = false;
                        break;
                    }
                }

                if (isPrinted) {
                    count++;
                    if (current.index == m) {
                        System.out.println(count);
                        break;
                    }
                }
            }
        }

        scanner.close();
    }
}

class Document {
    int index;
    int priority;

    public Document(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}

