import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int store = 0;
        int newNum = 0;

        while (n != 0) {
            int find = n % 10;
            int count = 0;
            int temp = n;

            while (temp != 0) {
                int rem = temp % 10;
                if (rem == find) {
                    count++;
                }
                temp /= 10;
            }

            if (count + 1 > store) {
                store = count + 1;
                newNum = find;
            }

            n /= 10;
        }

        System.out.println(newNum + " repeats " + store + " times");
    }
}
