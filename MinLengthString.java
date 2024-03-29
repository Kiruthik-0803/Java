public class MinLengthString {
    public static String findMinLengthString(int N, int K) {
        StringBuilder result = new StringBuilder();

        // Append all possible substrings of size N
        for (int i = 0; i < K; i++) {
            result.append(String.format("%0" + N + "d", Integer.parseInt(Integer.toString(i, K))));
        }

        // Truncate the string to its minimum possible length
        return result.substring(0, Math.min(K * N, result.length()));
    }

    public static void main(String[] args) {
        int N1 = 2, K1 = 2;
        String result1 = findMinLengthString(N1, K1);
        System.out.println("Input: N = " + N1 + ", K = " + K1);
        System.out.println("Output: " + result1);

        int N2 = 2, K2 = 3;
        String result2 = findMinLengthString(N2, K2);
        System.out.println("Input: N = " + N2 + ", K = " + K2);
        System.out.println("Output: " + result2);
    }
}
