import java.util.Scanner;

public class towerOfHonai {
    public static void solveHonai(int n, char source, char destination, char helper) {
        if (n == 1) {
            System.out.println("Move Disk " + n + " from " + source + " To " + destination);
            return;
        }
        solveHonai(n - 1, source, helper, destination);

        System.out.println("Move Disk " + n + " from " + source + " To " + destination);

        solveHonai(n - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Disks:");
        int n = sc.nextInt();

        solveHonai(n, 'A', 'C', 'B');// A=source,C=destination,B=helper
    }
}