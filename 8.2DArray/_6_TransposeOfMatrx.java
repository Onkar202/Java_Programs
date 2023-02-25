public class _6_TransposeOfMatrx {
    public static int[][] tranposeOfMatrix(int arr[][]) {
        int tranpose[][] = new int[arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                tranpose[i][j]=arr[j][i];
            }
            System.out.println();
        } 
        return tranpose;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{3,4,5}};
        // tranposeOfMatrix(arr);
        int tranpose[][]=tranposeOfMatrix(arr);
        for(int i=0;i<tranpose.length;i++){
            for(int j=0;j<tranpose[0].length;j++){
                System.out.print(tranpose[i][j]+" ");
            }
            System.out.println();
        } 
    }
}
