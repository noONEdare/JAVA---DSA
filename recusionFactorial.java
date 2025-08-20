public class recusionFactorial {
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = factorial(n - 1);
        fact *= n;
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
