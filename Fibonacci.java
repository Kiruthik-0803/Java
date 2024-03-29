public class Fibonacci {
    public static void fibonacci(int n) {
        int table[] = new int[n + 1];
        table[0] = 0;
        table[1] = 1;
        table[2] = 2;
        for (int i =3; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }
        for (int i = 0; i <= n; i++) {
            System.out.println(table[i]);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        fibonacci(n);
    }
}