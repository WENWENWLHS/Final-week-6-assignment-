import java.util.Arrays;

public class StatsCalculator {

    public static void main(String[] args) {
        double[] testValues = {-5.5, 10.7, 0.0, -3.8, 1.2, 4.3, -2.5, 1.2, 7.0, -0.5};

        Arrays.sort(testValues);

        System.out.println("Enhanced for loop printing: ");
        for (double value : testValues) {
            System.out.print(value + ", ");
        }
        System.out.println("\ntoString method printing: ");

        System.out.println(Arrays.toString(testValues));

        System.out.println("\nThe max value is: " + CalculateMax(testValues));
        System.out.println("\nThe min value is: " + CalculateMin(testValues));
        System.out.println("\nThe sum value is: " + CalculateSum(testValues));
        System.out.println("\nThe average value is: " + CalculateMean(testValues));
        System.out.println("\nThe median value is: " + CalculateMedian(testValues));
    }
    public StatsCalculator(){
        double [] values = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
    }

    /**
     * Find the maximum value in an array
     *
     * @param arr input array
     * @return maximum value of array or Integer.MIN_VALUE if array is empty
     */
    public static double CalculateMax(double[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        double max = arr[0];
        for (double value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Find the minimum value in an array
     *
     * @param arr input array
     * @return maximum value of array of Integer.MAX_VALUE if array is empty
     */
    public static double CalculateMin(double[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        double min = arr[0];
        for (double value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    /**
     * Find the sum of the array
     *
     * @param arr input array
     * @return sum value of array
     */
    public static double CalculateSum(double[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        double sum = 0.0;
        for (double value : arr) {
            if (value > 0.0) {
                sum = sum + value;
            }
        }
        return sum;
    }

    /**
     * Calculate the average of the array
     *
     * @param arr input array
     * @return average value of array
     */
    public static double CalculateMean(double[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        double sum = 0.0;
        double mean = 0.0;
        for (double value : arr) {
            if (value > 0.0) {
                sum = sum + value;

                mean = sum / arr.length;
            }
        }
        return mean;
    }

    /**
     * Calculate the median of the array
     *
     * @param arr input array
     * @return median value of the array
     */
    public static double CalculateMedian(double[] arr){
        if (arr.length % 2 != 0){
            return arr[arr.length / 2];
        }
        return (arr[ (arr.length - 1 ) / 2] + arr[arr.length / 2]);
    }

    /**
     * Calculate the first quartile
     *
     * @param arr input array
     * @return first quartile of the array
     */
    public static double CalculateFirstQuartile(double [] arr){
        if (arr.length == 0) {
            return 0;
        }

        return (arr[ (arr.length + 1 ) / 4]);
    }

    /**
     * Calculate the third quartile
     *
     * @param arr input array
     * @return third quartile of the array
     */
    public static double CalculateThirdQuartile(double [] arr){
        if (arr.length == 0) {
            return 0;
        }

        return (arr[ (arr.length + 1 ) * 3 / 4]);
    }
}