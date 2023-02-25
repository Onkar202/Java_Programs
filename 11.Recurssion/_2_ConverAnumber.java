public class _2_ConverAnumber {
    static String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void convertANumber(int n) {
        if(n==0){
            return;
        }
        convertANumber(n/10);
        System.err.print(arr[n%10]+" ");        
    }
    public static void main(String[] args) {
        convertANumber(1947);
    }
}
