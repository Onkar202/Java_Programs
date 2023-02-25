public class _4_countingSort {
    public static void countingSort(int arr[]) {
        int n = arr.length;
        int countRange = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            countRange = countRange<arr[i]?arr[i]:countRange;
        }
        int countarr[]=new int[countRange+1];

        for(int i=0;i<n;i++){
            countarr[arr[i]]++;
        }
        int j = 0;
        for(int i=0;i<countarr.length;i++){
            while(countarr[i]>0){
                arr[j++]=i;
                countarr[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,9,6,8,5,3,2,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
