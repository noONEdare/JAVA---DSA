public class recursionPower {
    public static int calcPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xPowern = calcPower(x, n - 1);
        int xPower = x * xPowern;
        return xPower;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int num = calcPower(x, n);
        System.out.println(num);
    }
}