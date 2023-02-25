import java.util.Arrays;

public class _7_isAnagrams {
    public static boolean isAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int a1[] = new int[26];
        int a2[] = new int[26];

        for(int i=0;i<s1.length();i++){
            a1[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length();i++){
            a2[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(a1[i] != a2[i]) return false;
        }
        
        return true;
    }
    public static boolean isAnagrams2(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(a1.equals(a2)) return true;
        
        return false;
    }
    public static void main(String[] args) {
        String s1 = "heart";
        String s2 = "earth1";
        System.out.println(isAnagrams2(s1, s2));
    }
}
