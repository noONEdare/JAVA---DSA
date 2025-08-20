
//Print sum of n natural no. with the help of recusion...
import java.util.Scanner;

public class recursionSum {
    public static void printSum(int n, int num, int sum) {
        if (n == num) {
            sum += num;
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n + 1, num, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of natural no. to be added:");
        int num = sc.nextInt();
        int sum = 0;
        int n = 1;
        printSum(n, num, sum);
    }
}
