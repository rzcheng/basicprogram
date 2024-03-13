import java.util.Arrays;

public class Basic {

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num * num;
        }
        return sum;
    }

    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        } else {
            return (arr[(arr.length / 2) - 1] + arr[arr.length / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        System.out.println("Sum of Squares: " + sumOfSquares(array));
        System.out.println("Median: " + findMedian(array));
    }
}