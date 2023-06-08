import java.util.Arrays;
import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {

            int[] numberArray = {1, 2, 3, 4, 5};
            int[] reversedArray = reverseArray(numberArray);

            Arrays.stream(reversedArray).forEach(System.out::print);
        }

        public static int[] reverseArray(int[] array) {
            return IntStream.range(0, array.length)
                    .map(i -> array[array.length - i - 1])
                    .toArray();
        }


}
