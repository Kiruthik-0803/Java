import java.util.*;

public class SortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] frequency = new int[1001];      
        for (int num : arr1) {
            frequency[num]++;
        }
        List<Integer> result = new ArrayList<>();
        for (int num : arr2) {
            while (frequency[num] > 0) {
                result.add(num); 
                frequency[num]--;
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            while (frequency[i] > 0) {
                result.add(i);
                frequency[i]--;
            }
        }
        
        int[] sortedArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sortedArr[i] = result.get(i);
        }
        
        return sortedArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 5, 3, 7, 1, 2, 1};
        int[] arr2 = {1, 3, 5};
        
        SortArray solution = new SortArray();
        int[] sortedArr = solution.relativeSortArray(arr1, arr2);

        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }
}

