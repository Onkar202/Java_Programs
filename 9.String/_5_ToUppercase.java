public class _5_ToUppercase {
    public static String toUppercase(String str) {
        StringBuilder ans = new StringBuilder("");

        ans.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(i<str.length()-1 && str.charAt(i)==' '){
                ans.append(str.charAt(i));
                ans.append(Character.toUpperCase(str.charAt(i+1)));
                i++;
            }else{
                ans.append(str.charAt(i));
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "Hello i am king rk";
        System.out.println(toUppercase(str));
    }
}
