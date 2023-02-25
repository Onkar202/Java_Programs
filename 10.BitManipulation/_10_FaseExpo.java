public class _10_FaseExpo {
    public static int fastExpo(int a,int b) {
        int ans = 1;
        while(b>0){
            if((b&1)!=0) ans *= a;
            a *= a;
            b>>=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(5, 4));
    }
}
