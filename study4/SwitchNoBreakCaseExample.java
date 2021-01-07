package study4;

public class SwitchNoBreakCaseExample {
    public static void main3(String[] args){
        int time = (int)(Math.random() * 4) + 8;
        // 0 ~ 3의 랜덤숫자가, 8 ~ 11까지로 랜덤 숫자 출력된다.
        System.out.println("[현재시간: " + time + "시]");

        switch(time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
            
        }
    }
    
}
