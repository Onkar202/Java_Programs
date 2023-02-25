public class _5_updateIthBit {
    public static int updateIthBit(int n,int i) {
        int bitmask = 1<<i;
        int getbit = n & bitmask;
        if(getbit != 0){
            n = n & ~bitmask;
        }       
        else{
            n = n | 1<<i;
        } 
        return n;
    }
    public static int updateBit(int n,int i,int newBit) {
        int bitmask = ~(1<<i);
        n = n&bitmask;
        return n | newBit<<i;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(4, 1));
        System.out.println(updateBit(7, 0, 0));
    }
}
