public class shadowing {
    static int x=20; //Shadowed at line 6 and not at 5
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        x = 40;
        System.out.println(x);
    }
}
