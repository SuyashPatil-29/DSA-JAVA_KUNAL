import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};

        int searchEle = 4;
        int[] pos = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == searchEle) {
                    pos[0] = i;
                    pos[1] = j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(pos));
    }
}
