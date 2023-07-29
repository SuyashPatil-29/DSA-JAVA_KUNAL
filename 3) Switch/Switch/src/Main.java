import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit= sc.next();

        switch (fruit) {
            case "Mango" -> System.out.println("Mango");
            case "Apple" -> System.out.println("Apple");
            default -> System.out.println("Enter valid fruit name");
        }
    }
}