import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _5_inbuiltSort {
    public static void main(String[] args) {
        Integer arr[]={3,4,6,42,45,5,7467,7,8,9};
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
