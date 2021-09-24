import java.util.*;

public class Butterfly_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
           for(int j=1;j<=((n-i)*2);j++){
               System.out.print(" ");
           }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=1;i<=n;i++){

            for(int j=n;j>=i;j--){
                System.out.print("*");
            }    
            for(int j=1;j<=((i-1)*2);j++){
                System.out.print(" ");
            }
            
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }         

            System.out.println();
        }
    }

}