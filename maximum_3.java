public class maximum_3 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 2, 3, 8, 1, 10, 9};
        int max1 = arr[0];
        int max2 = arr[0];
        int max3 = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3) {
                max3 = arr[i];
            }
        }
        
        System.out.println("Maximum value in the array: " + max1);
        System.out.println("Second maximum value in the array: " + max2);
        System.out.println("Third maximum value in the array: " + max3);
    }
}
