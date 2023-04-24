package week1.hwanginyoung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //입력받을 때 입력값의 앞뒤에 공백을 제거해주기 위해 trim() 사용
        String sentence = scanner.nextLine().trim();
        //split() 사용시 입력값에 " "을 입력해주면 문자열 처리가 되어 1이 되서 예외처리.
        if(sentence.isEmpty()){
            System.out.println(0);
        } else {
            String[] words = sentence.split(" ");
            System.out.println(words.length);
        }
    }
}

