package study3;
// 대입 연산자
public class AssignmentOperatorExample {
    public static void main7(String[] args) {
        
        int result = 0;
        result += 10;
        System.out.printf("result1 = %s%n", result); // 0 + 10 = 10
        result -= 5;
        System.out.printf("result2 = %s%n", result); // 10 - 5 = 5
        result *= 3;
        System.out.printf("result3 = %s%n", result); // 5 * 3 = 15
        result /= 5;
        System.out.printf("result4 = %s%n", result); // 15 / 5 = 3
        result %= 3;
        System.out.printf("result5 = %s%n", result); // 3 % 3 = 0
    }
}
