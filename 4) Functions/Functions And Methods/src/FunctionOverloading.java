public class FunctionOverloading {
    public static void main(String[] args) {
        print(12);
        print("Suyash");
    }

    static void print(int a){
        System.out.println(a);
    }

    static void print(String a){
        System.out.println(a);
    }
}
