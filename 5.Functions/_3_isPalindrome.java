public class _3_isPalindrome {
    public static void isPalindrome(int n) {
        int n2 = n;
        int reverse=0;
        while(n2>0){
            int rem = n2 % 10;
            reverse = reverse * 10 + rem;
            n2 /= 10;
        }
        if(n==reverse){
            System.out.println(n+" Is Palindrome number");
        }
        else{
            System.out.println(n+" Is Not Palindrome number");
        }

    }
    public static void main(String[] args) {
        isPalindrome(121);
        isPalindrome(321);
    }
}
