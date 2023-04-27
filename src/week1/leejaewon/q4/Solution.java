package week1.leejaewon.q4;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int totalWeight = 0;
		int totalNums = 0;
		int index = 0;
		int crossedBus = 0;
		Queue<Integer> bridge = new LinkedList<>();

		for (int i = 0; i < bridge_length; i++) {
			bridge.offer(0);
		}

		while (true) {
			answer++;
			if (bridge.peek() != 0) {
				totalNums--;
				totalWeight -= bridge.peek();
				crossedBus++;
			}
			bridge.poll();

			if (crossedBus >= truck_weights.length) {
				break;
			}

			if (index < truck_weights.length && totalNums < bridge_length
					&& totalWeight + truck_weights[index] <= weight
			) {
				totalNums++;
				totalWeight += truck_weights[index];
				bridge.offer(truck_weights[index++]);
				continue;
			}
			bridge.offer(0);
		}
		return answer;
	}
}
