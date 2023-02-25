public class _6_lowercaseVowel {
    public static int lowerCaseVowel(String str) {
        int n = str.length();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "hello how are you";
        System.out.println(lowerCaseVowel(str));
    }
}
