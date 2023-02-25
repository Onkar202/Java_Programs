public class _2_StringMergeSort {
    public static void main(String[] args) {
        String arr[]={"sun","earth","marse","mercury"};
        arr = mergeSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static String[] mergeSort(String arr[],int s,int e) {
        if(s>=e){
            String a[] = {arr[s]};
            return a;
        }
        int mid = s+(e-s)/2;
        String a[]=mergeSort(arr, s, mid);
        String b[]=mergeSort(arr,mid+1,e);
        String temp[] = merge(a,b);
        return temp;
    }

    public static String[] merge(String a[],String b[]) {
        int i=0,j=0;
        int k=0;
        String temp[]= new String[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i].compareTo(b[j])<0){
                temp[k++]=a[i++];
            }else{
                temp[k++]=b[j++];
            }
        }
        while(i<a.length){
            temp[k++]=a[i++];
        }
        while(j<b.length){
            temp[k++]=b[j++];
        }
        return temp;
    }
}
