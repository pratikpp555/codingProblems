import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int element, int[] array, int first, int last) {
        if (first > last) {
            return -1;
        }

        int mid = (first + last) / 2;

        if (array[mid] == element) {
            return 1;
        }

        if (element > array[mid]) {
            return binarySearch(element, array, mid + 1, last);
        } else {
            return binarySearch(element, array, first, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int searchElement = 8;

        if (binarySearch(searchElement, arr, 0, arr.length - 1) == 1) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
