import java.util.Arrays;

public class QuickSort {
    static int  partition(int arr[], int left, int right) {
        // chose a pivot
        int pivot = arr[right];
        
        int i = (left - 1);
        
        // loop only between the left and right 
        for (int j = left; j < right; j++) {
            // swap if current element is smaller than pivot 
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }


    static void sort(int arr[], int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            
            // move the right pivot once towards left
            sort(arr, left, pivot-1);
            
            // move the left pivot once towards the right
            sort(arr, pivot+1, right);
        }
    }

    public static void main(String args[]) {

        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };


        QuickSort.sort(actual, 0, actual.length - 1);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

    }
}
