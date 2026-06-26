public class BasicSlidingWindow {

    public static int maxSum(int[] arr, int k) {

        int sum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            sum = sum - arr[i - k]; // Remove the leftmost element
            sum = sum + arr[i];     // Add the new rightmost element

            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSum(arr, k));
    }
}