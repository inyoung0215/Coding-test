package week2.Hwanginyoung;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int sum = scanner.nextInt();
        int count = 0;
        int end = size - 1;
        int start = 0;
        while (start != end) {
            if (sum == arr[start] + arr[end]) {
                count++;
            }
            if (arr[start] + arr[end] < sum) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(count);
    }
}

