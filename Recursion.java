public class Recursion {
    public static void printOpenClosed(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("closed " + n);
        printOpenClosed(n - 1);
        System.out.println("open " + n);
    }
    public static void main(String[] args) {
        int n = 5;
        printOpenClosed(n);
    }
}