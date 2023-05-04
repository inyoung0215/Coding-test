package week2.Hwanginyoung;

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++){
            String input = scanner.next();
            switch (input){
                case "push_front": {
                    list.addFirst(scanner.nextInt());
                    break;
                }
                case "push_back": {
                    list.addLast(scanner.nextInt());
                    break;
                }
                case "pop_front": {
                    if (list.isEmpty()){
                        System.out.println(-1);
                    } else {
                        System.out.println(list.removeFirst());
                    }
                    break;
                }
                case "size": {
                    System.out.println(list.size());
                    break;
                }
                case "pop_back": {
                    if (list.isEmpty()){
                        System.out.println(-1);
                    } else {
                        System.out.println(list.removeLast());
                    }
                    break;
                }
                case "empty": {
                    if (list.isEmpty()){
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                }
                case "front": {
                    if (list.isEmpty()){
                        System.out.println(-1);
                    } else {
                        System.out.println(list.getFirst());
                    }
                    break;
                }
                case "back": {
                    if (list.isEmpty()){
                        System.out.println(-1);
                    } else {
                        System.out.println(list.getLast());
                    }
                    break;
                }
            }
        }
    }
}
