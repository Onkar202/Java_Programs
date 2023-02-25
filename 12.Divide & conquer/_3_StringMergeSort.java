public class _3_StringMergeSort {
    
    public static void main(String[] args) {
        String arr[]={"sun","earth","marse","mercury"};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(String arr[],int s,int e) {
        if(s<e){
            int mid = s+(e-s)/2;
            mergeSort(arr, s, mid);
            mergeSort(arr, mid+1, e);
            merge(arr,s,mid,e);
        }
    }

    public static void merge(String arr[],int s,int mid,int e) {
        int i=s;
        int j=mid+1;
        int k=0;
        String temp[]=new String[e-s+1];
        while(i<=mid && j<=e){
            if(arr[i].compareTo(arr[j])<0){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=e){
            temp[k++]=arr[j++];
        }

        for(i=0,j=s;i<temp.length;i++,j++){
            arr[j]=temp[i];
        }
    }
}
