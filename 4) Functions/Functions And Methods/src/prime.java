import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        prime(n);
    }

    static void prime(int n){
        for(int i=2; i<n; i++){
            if(n%2!=0){
                System.out.println("Prime");
                break;
            }
            else{
                System.out.println("Not prime");
                break;
            }
        }
    }
}
