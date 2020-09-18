public class BinarySearch {
    static int binarySearch(int arr[], int value) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == value)
                return mid;

            if (arr[mid] < value)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return -1;
    }

    static int binarySearch(int arr[], int left, int right, int value)
    {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == value)
                return mid;

            if (arr[mid] < value)
                return binarySearch(arr, mid + 1, right, value);

            return binarySearch(arr, left, mid - 1, value);
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };

        int x = 10;

        int result = binarySearch(arr, x);
        System.out.println("Element found at " + "index " + result);

        int bResult = binarySearch(arr, 0, arr.length - 1, x);
        System.out.println("Element found at index " + bResult);

    }
}
