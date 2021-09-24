import java.util.Scanner;

// import javax.print.event.PrintJobListener;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter operation: ");
        char op=sc.next().charAt(0);
        System.out.println("Enter second number: ");
        int n2=sc.nextInt();

        switch(op){
            case '+':System.out.println(n1+n2);
            break;
            case '-':System.out.println(n1-n2);
            break;
            case '*':System.out.println(n1*n2);
            break;
            case '/' : if(n2 == 0) {
                System.out.println("Invalid Division");
            } else {
                System.out.println(n1/n2);
            }
            break;
            case '%' : if(n2 == 0) {
                System.out.println("Invalid Division");
            } else {
                System.out.println(n1%n2);
            }
            break; 
            default : System.out.println("Invalid Operator");
            
        }
    
    }
}
