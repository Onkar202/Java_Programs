import java.util.ArrayList;

public class _7_KeypadCombination {
    static String[] arr = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

   public static void keypadCombination(String ques,String ans,ArrayList<String> a){
        if(ques.length()==0){
            a.add(ans);
            return;
        }
        
        char ch = ques.charAt(0);
        String letters = arr[ch-'0'];
        String quw = ques.substring(1);
        for(int i=0;i<letters.length();i++){
            char le = letters.charAt(i);
            keypadCombination(quw, ans+le,a);
        }

   }
    public static void main(String[] args) {
        String n = "239";
        ArrayList<String> a = new ArrayList<>();
        keypadCombination(n, "",a);
        System.out.println(a);
    }
}
