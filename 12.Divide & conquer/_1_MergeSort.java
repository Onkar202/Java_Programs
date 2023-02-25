class _1_MergeSort{
    
    public static void merge(int arr[],int s,int mid,int e) {
        
        int temp[]=new int[e-s+1];
        int i=s;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
                
            }
            else{
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
    public static void mergeSort(int arr[],int s,int e) {
        if(s>=e){            
            return;
        }
        int mid = s+(e-s)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merge(arr, s, mid, e);
        //return temp;
        
    }
    public static void main(String[] args) {
        int arr[]={8,7,6,5};
        mergeSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}