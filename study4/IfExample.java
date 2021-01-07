package study4;

import java.util.Scanner;

public class IfExample {
    public static void main0(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요.(0 ~ 100)");
        int score = sc.nextInt();
        

        if(score >= 90) {
            System.out.println("등급은 A 입니다.");
        }else if(score >= 80 && score < 90) {
            System.out.println("등급은 B 입니다.");
        }else if(score >= 70 && score < 80) {
            System.out.println("등급은 C 입니다.");
        }else if(score >= 60 && score < 70) {
            System.out.println("등급은 D 입니다.");
        }else if(score >= 50 && score < 60) {
            System.out.println("등급은 E 입니다.");
        }else {
            System.out.println("등급은 F 입니다.");
        }
    }
}