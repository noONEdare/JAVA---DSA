class bubbleSorting{
    public static void printarr(int[] arr){
        int size = arr.length;
        for(int i=0; i<size; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(string[] args){
        int[] arr = {5, 6, 4, 2, 3, 8, 1, 10, 9};
         //buble sort 
        for(int i=0; i<arr.length; i++){
            for(int j=1; i<=arr.length-i-1; i++){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        printarr(arr);
    }
}
