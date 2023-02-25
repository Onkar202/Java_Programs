public class _2_ShortestPathToReach {
    public static float shortestPath(String str) {
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='E') x++;
            else if(ch=='W') x--;
            else if(ch=='S') y--;
            else if(ch=='N') y++;
        }

        x = x*x;
        y = y*y;
        
        return (float)Math.sqrt(x+y);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}
