class _1_allOccurance{
    // Find All Occurance of key in array
    public static void allOccurance(int arr[],int key,int i) {
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        allOccurance(arr, key, i+1);
    }


    // Convert a number in letters
    
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        allOccurance(arr, 2, 0);

        System.out.println();
    }
}