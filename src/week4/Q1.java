package week4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr1 = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr1[i][j] = scanner.nextInt();
            }
        }
        int l = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] arr2 = new int[l][k];
        for (int i = 0; i < l; i++){
            for (int j = 0; j < k; j++){
                arr2[i][j] = scanner.nextInt();
            }
        }

        int[][] result = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int z = 0; z < m; z++) {
                    result[i][j] += arr1[i][z] * arr2[z][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

