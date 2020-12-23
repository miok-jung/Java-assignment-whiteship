package study2;

public class arr {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int k = 10;

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = k;
                k +=1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
