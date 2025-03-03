import java.util.Arrays;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Create a temporary array to store sorted elements
        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        // Merge nums1 and nums2 into temp[] arr

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1 (if any)
        // for nums1 elements of 1st sorted part
        while (i < m) {
            temp[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2 (if any)
        //for nums2 elements of 2nd sorted part
        while (j < n) {
            temp[k++] = nums2[j++];
        }

        // Copy sorted elements back to nums1
        for (i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }
    }

    public static void printArr(int arr[]) {
    
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
        
    }


    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        printArr(nums1);
        
        //System.out.println(Arrays.toString(nums1)); 
        // Output: [1, 2, 2, 3, 5, 6]
    }
}

