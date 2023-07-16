package IntroToIntelliJ;
import java.util.Scanner;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        int a = 5;
        float b = 5.453f;
        char c = 'C';
        double d = 24653418318.7197491;
        long largeIntValues = 6252847247924L;
        boolean e = true;
        String name = "My name is Suyash";

        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        char g = sc.next().charAt(0);
        float h = sc.nextFloat();
        double i = sc.nextDouble();
        long k = sc.nextLong();
        boolean j = sc.nextBoolean();
        String nameFromUser = sc.nextLine();
        String word = sc.next();
    }
}
