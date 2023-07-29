import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        System.out.println(list);

        for(int i = 0; i<5; i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);
    }
}
