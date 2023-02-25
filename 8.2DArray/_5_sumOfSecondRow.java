public class _5_sumOfSecondRow {
    public static int sumOfSecondRow(int arr[][]) {
        int row = 1;
        int sum = 0;
        for(int i=0;i<arr[0].length;i++){
            sum += arr[row][i];
        }
        return sum;

    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sumOfSecondRow(arr));
    }
}
