public class Assignment1 {
    public static void main(String[] args) {
        //even number
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println("##########################");
        //odd number
        int sumOdd = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
            }
        }
        System.out.println(sumOdd);
        System.out.println("########################### ");
        int sumSeven = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                sumSeven += i;
            }
        }
        System.out.println(sumSeven);
        System.out.println("#######################################");

        //even number while
        int sumWhileEven = 0;
        int i = 0;
        while (i <= 100) {

            if (i % 2 == 0) {
                sumWhileEven += i;
            }
            i++;
        }
        System.out.println(sumWhileEven);
        System.out.println("#######################################################3");
        //odd number
        int y = 0;
        int sumWhileOdd = 0;
        while (y <= 100) {

            if (y % 2 != 0) {
                sumWhileOdd += y;
            }
            y++;
        }
        System.out.println(sumWhileOdd);
        System.out.println("########################################");
        int z = 0;
        int sumWhileSeven = 0;
        while (z <= 100) {

            if (z % 7 == 0) {
                sumWhileSeven += z;
            }
            z++;
        }
        System.out.println(sumWhileSeven);
        System.out.println("######################################");
        //even number
        int h = 0;
        int sumOne = 0;
        do {

            if (h % 2 == 0) {
                sumOne += h;
            }
            h++;

        } while (h <= 100);
        System.out.println(sumOne);
        System.out.println("####################################");

        //odd number
        int j = 0;
        int sumTwo = 0;
        do {

            if (j % 2 != 0) {
                sumTwo += j;
            }
            j++;

        } while (j <= 100);
        System.out.println(sumTwo);
        System.out.println("########################################");
        int a = 0;
        int sumThree = 0;
        do {

            if (a % 7 == 0) {
                sumThree += a;
            }
            a++;

        } while (a <= 100);
        System.out.println(sumThree);


    }
}