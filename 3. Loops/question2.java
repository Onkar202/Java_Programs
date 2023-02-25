// factorial of number
import java.util.*;
class question2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int fac = 1;
        
        for(int i=num;i>0;i--){            
            fac *= i;
        }
        System.out.println("factorial of entered number is: "+fac);
    }
}