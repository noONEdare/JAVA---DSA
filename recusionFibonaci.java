public class recusionFibonaci {
    public static void fibonaci(int a, int b, int fabi) {
        if (fabi == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonaci(b,c, fabi-1);
    }
    
    public static void main(String[] args) {
        int fabi = 10;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        fibonaci(a , b, fabi-2);
    }
}
