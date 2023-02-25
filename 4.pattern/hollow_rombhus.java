public class hollow_rombhus {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n;j++){
                if((j>n && i==1) || (i==n && j>1 && j<=n+1)|| (j==2*n-i+1) || (i+j==7)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
