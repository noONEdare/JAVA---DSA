public class TwoPointerSum {
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 3, 5, 7, 10, 8, 6, 9};
        int target = 14;

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
                found = true;
                break;
            }
            else if(sum < target){
                left++;
            }
            else {
                right--;
            }
        }
        if(!found) {
            System.out.println("No pair found with the given sum.");
        }
    }
}
