public class _4_sum_of_digits {
    public static int sumOfDigits(int n) {
        int sum=0;
        while(n>0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(543));
    }
}
