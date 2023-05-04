package week2.kyungjunkim.q4;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(br.readLine());

        Arrays.sort(nums);

        int left = 0;
        int right = n - 1;
        int ans = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                ans++;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.print(ans);
    }
}
