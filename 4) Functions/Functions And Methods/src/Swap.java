import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        swap(num1, num2);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b= temp;

        System.out.println(a+" "+b);
    }
}
