public class _6_RatMaze {
    public static void printSol(int arr[][]) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int arr[][],int row,int col) {
        return arr[row][col]==1;
    }
    public static void helper(int arr[][],int ans[][],int row,int col){
        if(row==arr.length-1 && col==arr.length-1){
            ans[row][col]=1;
            printSol(ans);
            ans[row][col]=0;
            System.out.println("----------------");
            return;
        }
        else if(row==arr.length || col==arr.length){
            return;
        }
        if(isSafe(arr,row,col)){
            ans[row][col]=1;            
            helper(arr,ans,row+1,col);            
            helper(arr, ans, row, col+1);
            ans[row][col]=0;
        }
    }
    public static int[][] ways(int arr[][],int n,int m){        
        int ans[][] = new int[n][m];
        helper(ans,arr,0,0);
        return ans;
        
    }
    public static void main(String[] args) {
        int n = 4;
        int arr[][]={{1,1,0,0},{1,1,1,0},{1,0,1,0},{1,1,1,1}};
        int ans[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=0;
            }
        }
        
        helper(arr, ans, 0, 0);

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //        System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        // }
        // System.out.println("-------------------------");
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //        System.out.print(ans[i][j]);
        //     }
        //     System.out.println();
        // }
        // // ways(arr,0,0);
    }
}
