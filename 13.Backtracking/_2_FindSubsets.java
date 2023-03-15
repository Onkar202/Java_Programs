public class _2_FindSubsets {
    public static void findSubset(String str,int i,String str2) {
        if(i>=str.length()){
            System.out.println(str2);
            return;
        }

        findSubset(str, i+1, str2+str.charAt(i));
        findSubset(str, i+1, str2);
    }
  
    public static void main(String[] args) {
        //StringBuilder str2 = new StringBuilder("");
        findSubset("abc", 0,"");
    }
}
