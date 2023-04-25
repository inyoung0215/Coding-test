package week1.hwanginyoung;

import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alp = scanner.nextLine();
        int time = 0;
        //switch구문을 사용하여 입력된 문자열에 해당되는 소요시간 변수 time을 출력되도록 작성하였습니다.
        for (int i = 0; i < alp.length(); i++){
            switch (alp.charAt(i)) {
                case 'A': case 'B': case 'C':
                    time += 3;
                    break;
                case 'D': case 'E': case 'F':
                    time += 4;
                    break;
                case 'G': case 'H': case 'I':
                    time += 5;
                    break;
                case 'J': case 'K': case 'L':
                    time += 6;
                    break;
                case 'M': case 'N': case 'O':
                    time += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    time += 8;
                    break;
                case 'T': case 'U': case 'V':
                    time += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    time += 10;
                    break;
            }
        }
        System.out.println(time);

    }
}