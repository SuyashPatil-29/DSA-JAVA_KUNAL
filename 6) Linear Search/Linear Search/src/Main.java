import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr= {1,2,4,3,5};
        int searchEle = sc.nextInt();

        if(LSearch(arr, searchEle)==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println(LSearch(arr, searchEle));
        }
    }

    static int LSearch(int[] arr, int searchEle){

        for(int i=0; i<5;i++){
            if(arr[i]==searchEle){
                return i+1;
            }
        }
        return -1;
    }
}