public class _11_SwapNumbers {
    public static void swap(int a,int b) {
        a = a^b;
        b = b^a;
        a = a^b;

        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        swap(10, 12);
    }
}
