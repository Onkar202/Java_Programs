import java.util.Scanner;

public class Rectangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height of rectangle: ");
        int n = sc.nextInt();
        System.out.println("Enter width of rectangle: ");
        int m=sc.nextInt();


        for(int i=1;i<=n;i++){
            for(int j=1;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
