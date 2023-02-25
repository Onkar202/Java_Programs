public class _3_insertionSort {
    public static void insertionSort(int arr[]) {
      int n = arr.length;
      for(int i=1;i<n;i++){
        int j = i-1;
        int in = arr[i];
        while(j>=0 && arr[j]>in){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=in;
      }
    }

    public static void main(String[] args) {
        int arr[] = { 45, 32, 67, 2, 4, -1, 0 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
