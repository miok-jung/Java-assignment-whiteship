package study3;

public class LogicalOperatorExample {
    public static void main1(String[] args) {
        int charCode = 'A';

        if(charCode >= 65 && charCode <= 90) {
            System.out.println("대문자 이군요!");
        }

        if(charCode >= 97 && charCode <= 122) {
            System.out.println("소문자 이군요!");
        }

        if( !(charCode < 48) && !(charCode > 57)) {
            System.out.println("0~9 숫자 이군요");
        }

        int value = 6;
        if( (value%2 == 0) | (value%3 == 0)) {
            System.out.println("2 또는 3의 배수입니다.1");
        }
        if( (value%2 == 0) || (value%3 == 0)) {
            System.out.println("2 또는 3의 배수입니다.2");
        }
        // 자바에서는 논리연산자를 1개 혹은 2개해도 같은 결과가 나온다.
    }
}
