public class _2_binarySearch {
    public static void binarySearch(int arr[][], int key) {
        int s = 0, e = arr[0].length - 1;
        while (s < arr.length || e > arr[0].length) {
            if (arr[s][e] == key) {
                System.out.println(key + " found at (" + s + "," + e + ")");
                return;
            } else if (arr[s][e] < key) {
                s++;
            } else {
                e--;
            }
        }
        System.out.println("Key Not Found");
    }

    public static void binarySearch2(int arr[][], int key) {
        int s = arr.length - 1, e = 0;
        while (s >= 0 || e < arr[0].length) {
            if (arr[s][e] == key) {
                System.out.println(key + " found at (" + s + "," + e + ")");
                return;
            } else if (arr[s][e] < key) {
                s++;
            } else {
                e--;
            }
        }
        System.out.println("Key Not Found");
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5 },
                { 7, 8, 9, 10, 11 } };
        binarySearch(arr, 67);
        binarySearch2(arr, 7);
    }
}
