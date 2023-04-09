public class Assignment {
    public static void main(String[] args) {
       //even number
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("##########################");
        //odd number
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("########################### ");
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("#######################################");

        //even number while
        int i = 0;
        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("#######################################################3");
        //odd number
        int y = 0;
        while (y <= 100) {

            if (y % 3 == 0) {
                System.out.println(y);
            }
            y++;
        }
        System.out.println("########################################");
        int z = 0;
        while (z <= 100) {

            if (z % 7 == 0) {
                System.out.println(z);
            }
            z++;
        }
        System.out.println("######################################");
        //even number
        int h = 0;
        do {

            if (h % 2 == 0) {
                System.out.println(h);
            }
            h++;

        } while (h <= 100);
        System.out.println("####################################");

        //odd number
        int j=0;
        do {

            if(j% 3==0)
            { System.out.println(j);
            }
            j++;

        }while (j<=100);
        System.out.println("########################################");
        int a=0;
        do {

            if(a% 7==0)
            { System.out.println(a);
            }
            a++;

        }while (a<=100);


    }
}