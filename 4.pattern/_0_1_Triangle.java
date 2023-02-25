public class _0_1_Triangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((j%2==0 && i%2==0) || (j%2==1 && i%2==1)){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
