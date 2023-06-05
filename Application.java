

public class Application {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(numberArray);


        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i]);
        }

    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }

        return reversedArray;
    }


}
