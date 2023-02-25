class _1_oddOrEven{
    public static void oddOrEven(int n) {
        int check = n&1;
        if(check==0) {
            System.out.println(n+" Is even");
        }
        else System.out.println(n+" Is odd");
    }
    public static void main(String[] args) {
        oddOrEven(10);
        oddOrEven(11);
        oddOrEven(15);
        oddOrEven(16);
    }
}