public class _5_TowerOfHonoi {
    public static void ToweOfHonoi(int n,String A,String B,String C) {
        if(n==1){
            System.out.println("Transfer dist " +n+" from "+A+" to "+C);
            return;
        }

        ToweOfHonoi(n-1, A, C, B);
        System.out.println("Transfer dist "+n+" from "+A+" to "+C);
        ToweOfHonoi(n-1, B, A, C);
    }

    public static void main(String[] args) {
        int n=3;
        ToweOfHonoi(n, "A", "B", "C");
    }
}
