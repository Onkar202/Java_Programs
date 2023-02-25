// Positive or negative 
import java.util.*;
class question1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("Negative number");
        }else{
            System.out.println("Positive number");
        }
    }
}