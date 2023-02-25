// Positive or negative 
import java.util.*;
class question4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap year");
                }else{
                    System.out.println("Not Leap year");
                }
            }else{
                System.out.println("Leap year");
            }
        }else{
            System.out.println(" Not Leap year");        }
    }
}