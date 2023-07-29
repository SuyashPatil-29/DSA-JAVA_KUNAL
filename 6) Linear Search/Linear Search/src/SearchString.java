import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {

        String[] arr = {"apple", "banana", "mango"};
        String find = "banana";

        //System.out.println(Arrays.toString(find.toCharArray()));
        System.out.println(SearchStringFunc(arr, find));
    }

    static boolean SearchStringFunc(String[] arr, String find){

        for(String element : arr) {
            if (element.equals(find)) {
                return true;
            }
        }
        return false;
    }
}
