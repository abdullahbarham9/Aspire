public class Assignment2 {
    public static void main(String[] args) {
        System.out.println(SumEven(0, 100, 0));
        System.out.println(SumOdd(0, 100, 0));
        System.out.println(SumDivideBy7(0, 100, 0));

    }

    public static int SumEven(int start, int end, int sum) {
        return start > end ? sum : SumEven(start + 1, end, sum + (start % 2 == 0 ? start : 0));
    }

    public static int SumOdd(int start, int end, int sum) {
        return start > end ? sum : SumOdd(start + 1, end, sum + (start % 2 != 0 ? start : 0));

    }

    public static int SumDivideBy7(int start, int end, int sum) {
        return start > end ? sum : SumDivideBy7(start + 1, end, sum + (start % 7 == 0 ? start : 0));

    }
}
