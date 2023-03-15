import java.util.Scanner;
public class _9_KnightMove{    
    public static void printBoard(int arr[][],int n,int m) {
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
   public static boolean Nknight(int arr[][],int i,int j,int n,int m,int move){
    if(i<0 || j<0 || i>=n || j>=m || arr[i][j]>0){
        return false;
    }
    else if(move == n*n){
        arr[i][j]=move;
        // printBoard(arr, n,m);
        arr[i][j]=0;
        return true;
    }
        arr[i][j]=move;
        // if(j-1 >=0 && i-2 >=0)
           if(Nknight(arr,i-2,j+1,n,m,move+1))
                return true;
        // if(j+1 < n&& i-2 >=0)
           if(Nknight(arr,i-1,j+2,n,m,move+1))
                return true;
           if(Nknight(arr,i+1,j+2,n,m,move+1))
                return true;
        // if(j-2 >=0 && i-1>=0)
           if(Nknight(arr,i+2,j+1,n,m,move+1))
                return true;
        // if(j+2 < n&& i-1>=0)
           if(Nknight(arr,i+2,j-1,n,m,move+1))
                return true;
        // if(i+2 < n && j-1 >=0)
           if(Nknight(arr,i+1,j-2,n,m,move+1))
                return true;
        // if(j+1 < n&& i+2 < n)
           if(Nknight(arr,i-1,j-2,n,m,move+1))
                return true;
        // if(i+1 < n && j-2>=0)
           if(Nknight(arr,i-2,j-1,n,m,move+1))
                return true;
        // if(j+2 < n&& i+1 < n)
            
        arr[i][j]=0;

        return false;
        
    }

    public static void main(String[] args) {        
        // Scanner sc = new Scanner(System.in);
        int n = 4;  
        int m = 5;      
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=0;
            }
        }

        System.out.println(Nknight(arr,0,0,n,m,1));
        printBoard(arr, n,m);
        
    }
}
