class _8_SudokuSolver{

    public static boolean isSafe(int arr[][],int row,int col,int val) {
        for(int i=0;i<9;i++){
            if(arr[row][i]==val)
                return false;
        }
        for(int i=0;i<9;i++){
            if(arr[i][col]==val)
                return false;
        }
        
        int srow = (row/3)*3;
        int scol = (col/3)*3;

        for(int i=srow;i<srow+3;i++){
            for(int j=scol;j<scol+3;j++){
                if(arr[i][j]==val){
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean sudokuSolver(int arr[][],int row,int col) {
        if(row==9){
            return true;
        }
        int nrow = row,ncol = col+1;
        if(col+1==9){
            ncol=0;
            nrow = row+1;
        }
        if(arr[row][col] != 0){
            return sudokuSolver(arr, nrow, ncol);
        }
       
            for(int i=1;i<=9;i++){
                if(isSafe(arr,row,col,i)){
                    arr[row][col]=i;
                    if(sudokuSolver(arr, nrow, ncol))
                        return true;
                    arr[row][col]=0;
                }
            }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{0,0,8,0,0,0,0,0,0},{4,9,0,1,5,7,0,0,2},{0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},{0,0,0,0,2,0,0,6,0},{9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},{0,4,9,0,3,0,0,5,7},{8,2,7,0,0,9,0,1,3}};
        sudokuSolver(arr,0,0);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}