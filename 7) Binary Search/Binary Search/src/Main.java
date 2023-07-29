import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ary = new int[5];
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < ary.length; i++) {
            ary[i] = sc.nextInt();
        }

        System.out.println("Enter a target element");
        int searchEle = sc.nextInt();

        int lb = 0;
        int ub = ary.length - 1;
        int pos = -1;

        if(ary[lb]<=ary[ub]) {
            while (lb <= ub) {
                int mid = lb + (ub - lb) / 2;

                if (searchEle < ary[mid]) {
                    ub = mid - 1;
                } else if (searchEle > ary[mid]) {
                    lb = mid + 1;
                } else {
                    pos = mid;
                    break;
                }
            }
        }
        else{
            while (lb <= ub) {
                int mid = lb + (ub - lb) / 2;

                if (searchEle < ary[mid]) {
                    lb = mid + 1;
                } else if (searchEle > ary[mid]) {
                    ub = mid - 1;
                } else {
                    pos = mid;
                    break;
                }
            }
        }

        if (pos != -1) {
            System.out.println("Element found at " + (pos+1));
        } else {
            System.out.println("Element not found.");
        }
    }
}
