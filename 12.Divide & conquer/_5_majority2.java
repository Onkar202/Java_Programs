public class _5_majority2 {
    public static int count(int arr[],int num) {
        int count = 0;
        //int count2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
    public static int majority(int arr[],int i,int count) {
        if(i==arr.length){
            return majority(arr, i, count);
        }
        if(count < count(arr, arr[i])){
            count = count(arr, num);
        }

        return majority(arr,i+1,count);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4};
        System.out.println(majority(arr, 0));
    }
}
