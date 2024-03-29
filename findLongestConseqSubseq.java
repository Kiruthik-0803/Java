import java.util.*;
public class findLongestConseqSubseq {
    static int findLongestConseqSubseq1(int arr[], int n) {
        Arrays.sort(arr);
        int ans = 1, count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else if (arr[i] != arr[i - 1]) {
                count = 1;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;

        System.out.println("Length of the Longest contiguous subsequence is " + findLongestConseqSubseq1(arr, n));
    }
}