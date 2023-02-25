public class _4_continuesSubstring {
    
    public static int continuesSubstring(String str) {
        if(str.length()==1){
            return 1;
        }
        if(str.substring(0,1)==str.substring(str.length()-1)){
            return continuesSubstring(str.substring(1))+2;
        }else{
            return continuesSubstring(str.substring(1))+1;
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str.substring(0,1));
        System.out.println(str.substring(str.length()-1));
        System.out.println(continuesSubstring("abcab"));
    }
}
