public class _4_MajorityCount {
    public static int majorityElement(int arr[],int l,int r) {
        if(l==r){
            return arr[l];
        }

        int mid = l+(r-l)/2;
        int left = majorityElement(arr, l, mid);
        int right = majorityElement(arr, mid+1, r);

        if(left == right){
            return left;
        }

        int leftCount = countRange(arr, left, l, mid);
        int rightCOunt = countRange(arr, right, mid+1, right);

        return leftCount<rightCOunt?right:left;
    }
    public static int countRange(int arr[],int num,int l,int r) {
        int count = 0;
        for(int i=l;i<=r;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={};
        System.out.println(majorityElement(arr, 0, arr.length-1));
    }
}
