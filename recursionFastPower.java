import java.util.Scanner;

public class recursionFastPower {
    public static int calcPower(int n, int p) {
        if (n == 0) {
            return 0;
        }
        if (p == 0) {
            return 1;
        }

        int halfpower = calcPower(n, p / 2);

        if (p % 2 == 0) {
            return halfpower * halfpower;
        } else {
            return n * halfpower * halfpower;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the digit:");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();

        System.out.println("Enter the Power:");
        Scanner sc2 = new Scanner(System.in);
        int p = sc2.nextInt();

        int power = calcPower(n, p);
        System.out.println(power);
    }
}