public class binarySearch {
    public static int searchTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 8, 10, 12, 13, 15, 18, 20 };
        int target = 12;

        int result = searchTarget(arr, target);
        if (result == -1) {
            System.out.println("target not found");
        } else {
            System.out.println("target found on index:" + result);
        }
    }
}