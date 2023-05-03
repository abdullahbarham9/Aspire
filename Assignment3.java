import java.util.Arrays;

public class Assignment3 {

    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{1, 5, 7, 8}));
        System.out.println(minValue(new int[]{-1, 1, 5, 4, 7, 8}));
        System.out.println(averageValue(new int[]{50, 30, 90, 20, 41}));
        System.out.println(Arrays.toString(sortArray(new int[]{2, 5, 6, 7, 8, 9, 1})));
    }

    private static int maxValue(int[] numbers) {
        if (numbers == null || numbers.length == 0){
            System.out.println("empty");
            return 0;

        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

           if (numbers[i] > max) {
                max = numbers[i];
            }

        }

        return max;
    }

    private static int minValue(int[] numbers) {
        if (numbers == null || numbers.length == 0){
            System.out.println("empty2");
            return 0;

        }
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {


            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }


    private static double averageValue(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        return average;
    }

    private static int[] sortArray(int[] numbers) {
        int[] sortedArray = numbers.clone();
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }

}
