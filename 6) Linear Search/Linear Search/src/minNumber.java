public class minNumber {
    public static void main(String[] args) {

        int[] ary = {12,32, 11, 23,45,67,21,22,31};
        int min = ary[0];

        for(int i = 0; i<ary.length; i++){
            if(ary[i]<min){
                min=ary[i];
            }
        }
        System.out.println("Minimum element = "+ min);
    }
}
