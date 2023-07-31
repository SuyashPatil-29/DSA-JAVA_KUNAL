public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8, 10, 15, 20};
        int target = 14;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int arr[], int target) {
        int lb = 0;
        int ub = arr.length - 1;
        int ceilingValue = -1;

        while (lb <= ub) {
            int mid = lb + (ub - lb) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                ceilingValue = arr[mid];
                ub = mid - 1;
            } else {
                lb = mid + 1;
            }
        }

        return ceilingValue;
    }
}
