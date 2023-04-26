package week1.hwanginyoung;

public class Subject02 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int[] bridge = new int[bridge_length];
        int totalWeight = 0;
        int truck = 0;

        while (truck < truck_weights.length) {
            time++;
            totalWeight -= bridge[0];
            //다리 맨앞의 다 건넌 트럭의 무게를 빼주면서 초기화
            for (int i = 0; i < bridge_length - 1; i++) {
                bridge[i] = bridge[i + 1];
            }
            bridge[bridge_length - 1] = 0;
            //트럭을 움직였으니까 마지막 인덱스도 0으로 초기화

            //다리가 견딜 수 있는 무게 확인
            if (totalWeight + truck_weights[truck] <= weight) {
                totalWeight += truck_weights[truck];
                bridge[bridge_length - 1] = truck_weights[truck];
                truck++;
            }
        }
        time += bridge_length;
        return time;
    }

    public static void main(String[] args) {
        Subject02 solution = new Subject02();
        int[] arr = {7, 4, 5, 6};
        System.out.println(solution.solution(2, 10, arr));
    }
}
