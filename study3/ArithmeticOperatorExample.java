package study3;

public class ArithmeticOperatorExample {
    public static void main0(String[] args) {
        int v1 = 5;
        int v2 = 2;

        // 산술 연산
        int result1 = v1 + v2;
        System.out.println("result1 = " + result1);

        int result2 = v1 - v2;
        System.out.println("result2 = " + result2);

        int result3 = v1 * v2;
        System.out.println("result3 = " + result3);

        int result4 = v1 / v2;
        System.out.println("result4 = " + result4);

        int result5 = v1 % v2;
        System.out.println("result5 = " + result5);

        double result6 = (double) v1 / v2;
        System.out.println("result6 = " + result6);

        // char 타입 연산
        char c1 = 'A' + 1;
        System.out.println("c1 : " + c1);
        // 유니코드 값에 의해 A는 65유니코드에서 일정값을 더하면 해당하는 유니코드 값으로 변환하여 나온다.
    }
}