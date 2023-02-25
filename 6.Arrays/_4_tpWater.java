public class _4_tpWater {

    public static int mstep(int n, int k, String s) {
        int half = n / 2;
        int count = 0;
        for (int i = 0; i < half; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                count++;
            }
        }
        return count / k + (count % k != 0 ? 1 : 0);
    }

    public static int Trap(int arr[]) {
        int n = arr.length;
        int l = 0, r = n - 1;
        int left = arr[0], right = arr[n - 1];
        int ans = 0;
        while (l <= r) {
            if (left < right) {
                left = Math.max(left, arr[l]);
                ans += left - arr[l];
                l++;
            } else {
                right = Math.max(right, arr[r]);
                ans += right - arr[r];
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        System.out.println(Trap(arr));
    }

}
