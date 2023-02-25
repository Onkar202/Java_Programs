public class _3_largestString {
    public static String largestString(String str[]) {
        String largest = "";
        for(int i=0;i<str.length;i++){
            if(largest.compareToIgnoreCase(str[i])<0){
                largest = str[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String str[]={"apple","Mango","banana"};
        System.out.println(largestString(str));
    }
}
