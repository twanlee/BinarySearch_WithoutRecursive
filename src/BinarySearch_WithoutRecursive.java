public class BinarySearch_WithoutRecursive {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int key = 10;
        int index = binarySearch(list, key);
        System.out.println("Element key found at index: " + index);
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                return right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

