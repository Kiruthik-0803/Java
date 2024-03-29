public class Fibonacci1 {
    public static int fibonacci1(int memo[], int n) {
        if (memo[n] == 0) {
            if (n < 2)
                memo[n] = n;
            else
                memo[n] = fibonacci1(memo, n - 1) + fibonacci1(memo, n - 2);
        }
        return memo[n];
    }
    public static void main(String[] args) {
        int n = 6;
        int[] memo = new int[n + 1]; 
        System.out.println("Fibonacci(" + n + ") = " + fibonacci1(memo, n));
    }
}
