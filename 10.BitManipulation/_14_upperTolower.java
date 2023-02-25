public class _14_upperTolower {
    public static void upTolow() {
        for(char ch = 'A';ch <= 'Z';ch++){
            System.out.print((char)(ch | ' ')+" ");
        }
    }
    public static void main(String[] args) {
        upTolow();
    }
}
