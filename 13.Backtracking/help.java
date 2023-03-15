import java.util.*;
class help{
    public static boolean isSafe(int n,int i,int j,int maze[][],int vis[][]) {
        
        return((i>=0 && i<n) && (j>=0 && j<n) && (maze[i][j]==1) && vis[i][j] != 1);
    }
    public static void ratInMaze(int n,int i,int j,int maze[][],ArrayList<String> paths,int [][]vis,String path) {
        if(i==n-1 && j==n-1){
            paths.add(path);
            return;
        }
        // Down 
        if(isSafe(n,i,j,maze,vis)){
            vis[i][j]=1;
            ratInMaze(n, i+1, j, maze, paths, vis, path+'D');
            vis[i][j]=0;
        }
        // Right 
        if(isSafe(n,i,j,maze,vis)){
            vis[i][j]=1;
            ratInMaze(n, i, j+1, maze, paths, vis, path+'R');
            vis[i][j]=0;
        }
        // Up 
        if(isSafe(n,i,j,maze,vis)){
            vis[i][j]=1;
            ratInMaze(n, i-1, j, maze, paths, vis, path+'U');
            vis[i][j]=0;
        }
        // Left
        if(isSafe(n,i,j,maze,vis)){
            vis[i][j]=1;
            ratInMaze(n, i, j-1, maze, paths, vis, path+'L');
            vis[i][j]=0;
        }
    }
    public static void main(String[] args) {
        int n = 2;
        int maze[][]={{1,0},{1,0}};
        ArrayList<String> paths = new ArrayList<>();
        int vis[][]=new int[n][n];
        int i=0,j=0;
        String path = "";
        ratInMaze(n,i,j,maze,paths,vis,path);
        System.out.println(paths);
    }
}