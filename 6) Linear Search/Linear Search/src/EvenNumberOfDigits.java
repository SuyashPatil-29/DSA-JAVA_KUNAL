public class EvenNumberOfDigits {
    public static void main(String[] args) {

    }

    static int findNumbers(int[] nums) {
        int count =0;

        for(int number : nums){
            if(even(number)){

                count++;
            }
        }

        return count;
    }

    static boolean even(int number) {

        int len=0;
        while(number>0){
            number = number/10;
            len++;
        }

        if(len % 2==0){
            return true;
        }
        return false;
    }
}
