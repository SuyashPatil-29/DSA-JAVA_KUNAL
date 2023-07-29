import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
////        int[] arr = new int[5];
////
////        for(int i= 0; i<arr.length; i++){
////            arr[i]= sc.nextInt();
////        }
////
////        for(int num : arr){
////            System.out.println(num);
////        }
//
//        int[][] arr2D = new int[3][3];
//
//        for(int i=0; i<arr2D.length; i++){
//            for(int j=0; j<arr2D[i].length; j++){
//                arr2D[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i=0; i<arr2D.length; i++){
//            for(int j=0; j<arr2D[i].length; j++){
//                System.out.print(arr2D[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        for (int[] ints : arr2D) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
//
//        for(int[] row : arr2D){
//            System.out.println(Arrays.toString(row));
//        }

        int[] arr2 = new int[5];

        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println(arr2);
    }
}