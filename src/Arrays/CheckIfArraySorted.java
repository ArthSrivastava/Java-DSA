package Arrays;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 5, 67, 9, 10};
        boolean isSorted = true;
        for(int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Unsorted");
        }
    }
}
