import java.util.Scanner;

public class recursionTilingProblem {
    public static int countWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n (for 2 x n floor): ");
        int n = sc.nextInt();

        int ways = countWays(n);

        System.out.println("Number of ways to tile 2 x " + n + " floor: " + ways);
    }
}
