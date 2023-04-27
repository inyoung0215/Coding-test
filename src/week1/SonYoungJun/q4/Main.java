package week1.SonYoungJun.q4;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        solution(bridge_length, weight, truck_weights);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<bridge_length; i++) {
            q.add(0);
        }
        int truckCnt = 0, curWeight = 0;
        while(truckCnt < truck_weights.length) {
            curWeight -= q.poll();
            answer++;
            if(truck_weights[truckCnt] + curWeight <= weight) {
                curWeight += truck_weights[truckCnt];
                q.add(truck_weights[truckCnt++]);
            }
            else
                q.add(0);
        }
        return answer + bridge_length;
    }
}