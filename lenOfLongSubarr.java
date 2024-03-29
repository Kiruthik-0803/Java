
public class lenOfLongSubarr {
    static int lenOfLongSubarr1(int[] arr, int n, int k) {
        int maxlength = 0;
        for (int i = 0; i < n; i++) {
            int Sum = 0;
            for (int j = i; j < n; j++) {
                Sum += arr[j];
                if (Sum == k) {
                    maxlength = Math.max(maxlength, j - i + 1);
                }
            }
        }
        return maxlength;
    }

    public static void main(String args[]) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int n = arr.length;
        int k = 15;
        System.out.println("Length = " + lenOfLongSubarr1(arr, n, k));
    }
}

