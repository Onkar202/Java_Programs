class _1_BacktrackingOnArrays{
    public static void onArrays(int arr[],int i,int j) {
        if(i>=arr.length){
            return;
        }
        arr[i]=j;
        onArrays(arr, i+1, j+1);
        arr[i]-=2;
        
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        onArrays(arr, 0, 1);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}