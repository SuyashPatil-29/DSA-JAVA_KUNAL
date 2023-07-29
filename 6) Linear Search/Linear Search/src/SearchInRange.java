import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start and the finish index");
        int start = sc.nextInt();
        int finish = sc.nextInt();

        int[] ary = {1,2,3,4,5};

        int pos = -1;
        int searchElm = 3;

        for(int i = start; i<=finish; i++){
            if(ary[i]==searchElm){
                pos = i;
                break;
            }
        }

        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at "+ pos);
        }
    }
}
