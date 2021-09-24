import java.util.*;

// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Hollow_Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height of rectangle: ");
        int n = sc.nextInt();
        System.out.println("Enter width of rectangle: ");
        int m=sc.nextInt();


        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j==1 || j==m){
                    System.out.print("*");
                }
                else if(i==1 || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
}
