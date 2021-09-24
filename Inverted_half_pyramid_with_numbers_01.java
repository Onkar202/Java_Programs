import java.util.Scanner;

public class Inverted_half_pyramid_with_numbers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of pyramid: ");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");                
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
