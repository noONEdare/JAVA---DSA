import java.util.Scanner;
public class dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the size of a windows: ");
        int window = sc.nextInt();

        int[] arr = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int size = arr.length;
        int sum = 0;

        for(int i = 0; i<window; i++){
            sum += arr[i];
        }
        System.out.println("Sum of starting " + window + " elements is: " + sum);
        
        for(int i = window; i < size; i++){
            sum = sum - arr[i - window] + arr[i];
            System.out.println("Sum of next " + window + " elements is: " + sum);
        }
    }
}
