class _1_linierSearch{
    public static int linierSearch(int arr[][],int key){
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==key){
                    System.out.println(key+" found at ("+i+","+j+")");
                    return 0;
                }
            }
        }
        System.out.println(key+" Not found"); 
        return 1;       
    }
    public static void main(String[] args) {
        int arr[][]={{23,44,55,89},{56,73,21,90},{45,55,67,68}};
        System.out.println(arr[0].length);
        System.out.println((linierSearch(arr, 68)));
    }
}