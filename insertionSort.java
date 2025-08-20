public class insertionSort {
    public static void printarr(int[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(" }");
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 2, 3, 8, 1, 10, 9 };
        int size = arr.length;
        printarr(arr);

        for (int i = 0; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        printarr(arr);
    }
}
