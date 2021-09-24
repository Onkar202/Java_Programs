import java.util.*;

public class Prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int flag = 0;
        for(int i=2;i<=(n/2);i++){
            if(n % i == 0){
                System.out.println(n+" Is non-Prime number");
                flag = 1;               
                break;
            }
        }

        if(flag==0){
            System.out.println(n+" Is a prime number");
        }

    }
}
