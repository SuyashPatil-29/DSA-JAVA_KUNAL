import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        sum(1,2,3,55,44,32,13,45);
    }

    static void sum(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
