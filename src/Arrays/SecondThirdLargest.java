package Arrays;

public class SecondThirdLargest {
    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 26, 26};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for (int e : arr) {
            if (e > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = e;
            }
        }
        System.out.println("Largest:" + largest);
        System.out.println("Second Largest:" + secondLargest);
        System.out.println("Third Largest:" + thirdLargest);
    }
}
