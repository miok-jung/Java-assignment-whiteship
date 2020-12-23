package study3;

import java.util.Scanner;

public class ConditionalOperationExample {
    public static void main4(String[] args) {
        // 삼항 연산자
        Scanner sc = new Scanner(System.in);
        int score;
        System.out.printf("숫자를 입력하세요 : ");
        score = sc.nextInt();

        
        
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
