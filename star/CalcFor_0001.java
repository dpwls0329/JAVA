package star;

// import static java.lang.Math.sqrt;

public class CalcFor_0001 {
    public static void calaFor_0002(int input_x,int input_y) {
        // for(int i=0; i<=input_y; i++){
        //     for(int j=0; j<i; j++){
        //         System.out.print("*"); 
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < input_y; i++) {
        //     for (int j = 0; j < input_y - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < 2 * i - 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = input_y; i > 0; i--) { //아래쪽 삼각형
        //     for (int j = input_y; j > i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i * 2 - 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i <= input_y * 2; i++) {
        //     for (int j = 0; j <= input_y * 2; j++) {
        //         //원의 중심좌표(n,n)로부터 (i,j)사이의 거리를 구함
        //         int d = (int) sqrt((i - input_y) * (i - input_y) + (j - input_y) * (j - input_y));
        //         //(i,j)좌표가 (n,n)사이의 거리가 반지름의길이 이하일때  좌표를 찍는다.
        //         if (d <= input_y) {
        //             System.out.print("*  ");
        //         } else {
        //             System.out.print("   ");
        //         }
        //     }
        //     System.out.println();
        // }
        int k = 0;
        String[][] arr = new String[input_x][input_y];
        for(int i = 0;i<input_y;i++){
            for(int j=0;j<input_x;j++){
                arr[j][i]="*";
            }
        }
        for(int i=9;i<20; i++){
            for(int j=14-k; j<14+k+1; j++){
                arr[j][i]="@";
            }
            k++;
        }
        k=0;
        for(int i=19;i<30; i++){
            for(int j=40+k-1;j<60-k;j++){
                arr[j][i]="#";
            }
            k++;
        }
        for(int i=0; i<input_y;i++){
            for(int j=0; j<input_x;j++){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }

        
    }
}
