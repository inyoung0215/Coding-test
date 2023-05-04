package week2.Hwanginyoung;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        LinkedList<Integer> deque = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            deque.add(i);
        }
        int count = scanner.nextInt();
        int move = 0;
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            while (true) {
                int index = deque.indexOf(num);
                if (deque.peek() == num) {
                    deque.remove();
                    break;
                } else if (index <= deque.size() / 2) {
                    deque.add(deque.remove());
                    move++;
                } else {
                    deque.addFirst(deque.removeLast());
                    move++;
                }
            }
        }
        System.out.println(move);
    }
}