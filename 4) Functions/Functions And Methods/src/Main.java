import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1= sc.nextInt();
        int num2= sc.nextInt();

        System.out.println(greet(num1, num2));
    }

    static int greet(int a, int b){
        return a+b;
    }
}