class bubbleSorting{
    public static void printarr(int[] arr){
        int size = arr.length;
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {5, 6, 4, 2, 3, 8, 1, 10, 9};
        printarr(arr);
        //bubble sort
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printarr(arr);
    }
}