package study3;

public class BitShiftExample {
    public static void main3(String[] args) {
        // 1이라는 비트 값에서, 우측에서 왼쪽으로 3칸이동
        System.out.println("1 << 3 = " + (1<<3));
        // 좌측에서 우측으로 3칸이동, 좌측 빈공간은 최상위 비트값을 따라가고, 우측 나머지 비트값은 버려진다.
        System.out.println("-8 >> 3 = " + (-8>>3));
        // 좌측에서 우측으로 3칸 이동, 빈공간 좌측은 0값을 가지고, 우측 나머지 비트값은 버려진다.
        System.out.println("-8 << 3 = " + (-8>>>3));
    }
}
