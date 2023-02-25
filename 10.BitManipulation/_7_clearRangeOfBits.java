class _7_clearRangeOfBits{
    public static int clearRangeofBitd(int n,int i,int j) {
        int a = (-1<<j+1);
        int b = ~(-1<<i);
        int bitmask = a|b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeofBitd(7 , 0, 1));
    }
}