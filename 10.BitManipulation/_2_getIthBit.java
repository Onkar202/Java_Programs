public class _2_getIthBit {
    public static int getIthBit(int n,int i) {
        int check = n&1<<i;

        if(check != 0)
            return 1;
    
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(8, 3));
    }
}
