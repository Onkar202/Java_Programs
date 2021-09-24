import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zeros = 0;        
        int Positive = 0;        
        int Negative = 0; 
        System.out.println("Enter a number  of that how many numbers you want to check: "); 
        int n1=sc.nextInt();
        System.out.println("Enter numbers: ");
        for(int i=1;i<=n1;i++){
            int n = sc.nextInt();
            if(n==0){
                zeros+=1;
            }
            else if(n<0){
                Negative+=1;
            }
            else if(n>0){
                Positive+=1;
            }
           
        }

        System.out.println("you entered "+ zeros+" Zeroes");
        System.out.println("you entered "+ Positive +" Positive numbers");
        System.out.println("you entered "+ Negative +" Negative numbers");
    }    
}
