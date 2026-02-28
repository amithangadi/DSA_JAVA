package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] a, int li, int mid, int hi) {

        int s1 = mid - li + 1;
        int s2 = hi - mid;

        int[] L = new int[s1];
        int[] R = new int[s2];

        // Copy left array
        for (int i = 0; i < s1; i++) {
            L[i] = a[li + i];
        }

        // Copy right array
        for (int j = 0; j < s2; j++) {
            R[j] = a[mid + 1 + j];
        }

        int i = 0, j = 0, k = li;

        // Merge both arrays
        while (i < s1 && j < s2) {
            if (L[i] < R[j]) {
                a[k++] = L[i++];
            } else {
                a[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < s1) {
            a[k++] = L[i++];
        }

        while (j < s2) {
            a[k++] = R[j++];
        }
    }

    static void divide(int[] arr, int li, int hi) {
        if (li < hi) {
            int mid = (li + hi) / 2;

            divide(arr, li, mid);
            divide(arr, mid + 1, hi);
            merge(arr, li, mid, hi);
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 8, 1, 3, 4, 2, 7, 6};

        System.out.println("Before sort: " + Arrays.toString(arr));

        divide(arr, 0, arr.length - 1);

        System.out.println("After sort: " + Arrays.toString(arr));
    }
}
