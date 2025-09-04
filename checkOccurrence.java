public class checkOccurrence {
    public static int firstOccurence(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurence(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 8, 10, 10, 10, 10, 18, 20 };
        int target = 10;

        int fo = firstOccurence(arr, target);
        int lo = lastOccurence(arr, target);

        if (fo == -1 && lo == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println(
                    "The first Occurence of target is on index:" + fo + " and the last Occurrence is on index:" + lo);
        }

    }
}