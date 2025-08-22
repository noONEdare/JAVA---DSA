public class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end) {
        int s1 = mid - start + 1;
        int s2 = end - mid;

        int[] arrL = new int[s1];
        int[] arrR = new int[s2];

        for (int i = 0; i < s1; ++i) {
            arrL[i] = arr[start + i];
        }
        for (int j = 0; j < s2; ++j) {
            arrR[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = start;
        while (i < s1 && j < s2) {
            if (arrL[i] <= arrR[j]) {
                arr[k] = arrL[i];
                i++;
            } else {
                arr[k] = arrR[j];
                j++;
            }
            k++;
        }

        while (i < s1) {
            arr[k] = arrL[i];
            i++;
            k++;
        }
        while (j < s2) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 2, 3, 8, 1, 10, 9 };
        int size = arr.length;
        mergeSort(arr, 0, size - 1);

        System.out.print("{ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
    }
}
