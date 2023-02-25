// Read set of integer and print sum of even and odd
import java.util.*;
class question1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oddsum=0,evensum=0;
        int n=5;
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num%2==0) evensum+=num;
            else oddsum+= num;
        }

        System.out.println("Sum of even numbers: "+evensum);
        System.out.println("Sum of odd numbers: "+oddsum);
    }
}