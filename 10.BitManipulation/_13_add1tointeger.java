public class _13_add1tointeger {
    public static int addOne(int n) {
        return -~n;
    }
    public static void main(String[] args) {
        System.out.println(addOne(6));
    }
}
