import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        for(int i=0;i<n;i++){
            System.out.println(n1);
            int nth = n1 + n2;          
                n1 = n2;
                n2 = nth;
        }

    }    
}
