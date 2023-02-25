public class _4_CompressString {
    public static String compressString(String str) {
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            ans.append(str.charAt(i));
            String s = count.toString();
            if(count>1)  ans.append(s);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbbc";
        System.out.println(compressString(str));
    }
}
