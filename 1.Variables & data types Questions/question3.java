// Return a bill of three items with 18% gst
import java.util.*;
class question3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of Items pen,pensil,eraser Respectively: ");
        float pen = sc.nextInt();
        float pensil = sc.nextInt();
        float eraser = sc.nextFloat();
        System.out.println("Total biil of your items with 18% gst is: ");
        float sum = pen+pensil+eraser;
        System.out.println(sum+((sum*18)/100));
    }
}