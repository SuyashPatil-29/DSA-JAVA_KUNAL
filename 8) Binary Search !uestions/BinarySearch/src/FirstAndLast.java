import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] numbs, int target) {
        int pos1 =-1;
        int pos2 =-1;
        int ub = numbs.length;
        int lb = 0;
        int[] res = {pos1, pos2};

        while(lb<=ub){
            int mid = (ub+lb)/2;
            if(numbs[mid] == target){
                pos1 = mid;
                break;
            }
            else if (numbs[mid] > target) {
                ub = mid - 1;
            } else {
                lb = mid + 1;
            }
        }

        while(lb<=ub){
            int mid = (ub+lb)/2;
            if(numbs[mid] == target){
                pos2 = mid;
            }
            else if (numbs[mid] > target) {
                ub = mid - 1;
            } else {
                lb = mid + 1;
            }
        }
        return res;
    }
}
