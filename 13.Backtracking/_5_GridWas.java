public class _5_GridWas {
    static int count=0;
    public static int fac(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f *= i;
        }
        return f;
    }
    public static int countWays(int arr[][],int n,int m) {
        
        return fac(n-1+m-1)/(fac(n-1)*fac(m-1));
    }
    public static int countWays2(int i,int j) {
        if(i==1 && j==1){
            return 1;
        }
        else if(i<=0 || j<=0)
            return 0;
        
        int w1 = countWays2(i-1,j);
        int w2 = countWays2(i,j-1);

        return w1+w2;
    }

    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        System.out.println(countWays(arr, 3, 3));
        System.out.println(countWays2( 4, 4));
    }
}
