import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] theArray, int arrayLength) {
        if (arrayLength < 2) {
            return;
        }
        int mid = arrayLength / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arrayLength - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = theArray[i];
        }
        for (int i = mid; i < arrayLength; i++) {
            rightArray[i - mid] = theArray[i];
        }
        mergeSort(leftArray, mid);
        mergeSort(rightArray, arrayLength - mid);
        
        // then merge them
        merge(theArray, leftArray, rightArray, mid, arrayLength - mid);
    }

    public static void merge(
            int[] theArray, int[] leftArray, int[] rightArray, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                theArray[k++] = leftArray[i++];
            }
            else {
                theArray[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            theArray[k++] = leftArray[i++];
        }
        while (j < right) {
            theArray[k++] = rightArray[j++];
        }
    }

    public static void main(String args[]) {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual, actual.length);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

    }
}
