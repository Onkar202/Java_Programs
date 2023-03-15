import java.util.*;
public class _3_FindPermutation {
    public static boolean isPresent(ArrayList<String> ans,String str){    
          
        for(int i=0;i<ans.size();i++){
            // System.out.println(ans.get(i));
            String sr = ans.get(i);
            if(sr.equals(str)){
                return true;
            }
        }
        return false;
    }
    public static void findPermutation(String str,String ans,ArrayList<String> sr) {
        if(str.length()==0){
            if(!isPresent(sr, ans))
                sr.add(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String newster = str.substring(0, i)+str.substring(i+1);
            findPermutation(newster, ans+ch,sr);
        }
        
    }
    public static void main(String[] args) {
        ArrayList<String> str2 = new ArrayList<>();
        findPermutation("abb", "",str2);
        System.out.println(str2);
        System.out.println(isPresent(str2, "bab"));
    }
}
