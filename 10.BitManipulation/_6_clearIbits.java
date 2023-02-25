public class _6_clearIbits {
    public static int clearIbits(int n,int i) {
        for(int j=0;j<=i;j++){
            n = n & ~(1<<j);
        }
        return n;
    }
    public static void main(String[] args) {
        System.err.println(clearIbits(7, 1));
    }
}
