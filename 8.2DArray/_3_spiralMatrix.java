public class _3_spiralMatrix {
    public static void spiralMatrix(int arr[][]) {
        int srow = 0,scol = 0;
        int erow = arr.length-1,ecol = arr[0].length-1;
        while(srow <= erow){
            for(int i=scol;i<=ecol;i++){
                if(srow>erow) break;
                System.out.print(arr[srow][i]+" ");
            }
            srow++;
            for(int i=srow;i<=erow;i++){
                if(srow>erow) break;
                System.out.print(arr[i][ecol]+" ");
            }
            ecol--;
            for(int i=ecol;i>=scol;i--){
                if(srow>erow) break;
                System.out.print(arr[erow][i]+" ");
            }
            erow--;
            for(int i=erow;i>=srow;i--){
                if(srow>erow) break;
                System.out.print(arr[i][scol]+" ");
            }
            scol++;
        }
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5 },
                { 7, 8, 9, 10, 11 },
            {4,5,6,78,33},
        {13,14,15,16,17}};
            spiralMatrix(arr);
    }
}
