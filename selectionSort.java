public class selectionSort {
    public static void printarr(int[] arr){
        System.out.print("{ ");
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(", ");

            }
        }
        System.out.print(" }");
        System.out.println("");
    }
    public static void main(String[] args){
        int[] arr = {5, 6, 7, 3, 9, 1, 10, 2, 4, 8};
        int size = arr.length;
        printarr(arr);

        for(int i = 0; i<size-1; i++){
            int minimum = i;
            for(int j = i+1; j<size; j++){
                if(arr[j]<arr[minimum]){
                    minimum = j;
                }
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
            printarr(arr);
        }
        printarr(arr);
    }
}