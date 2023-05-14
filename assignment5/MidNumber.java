package assignment5;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MidNumber {
    private final PriorityQueue<Integer> higher;
    private final PriorityQueue<Integer> lower;

    public MidNumber() {
        higher = new PriorityQueue<>(Integer::compareTo);
        lower = new PriorityQueue<>(Comparator.<Integer>comparingInt(a -> a).reversed());
    }

    public static void main(String[] args) {
        MidNumber midNumber = new MidNumber();
        midNumber.addNumber(6);
        midNumber.addNumber(4);
        midNumber.addNumber(6);
        midNumber.addNumber(5);
        midNumber.addNumber(2);
        midNumber.addNumber(3);
        System.out.println("mid number is: " + midNumber.getMidNumber());
    }

    public void addNumber(int num) {
        higher.add(num);
        if (higher.size() - lower.size() >= 2) {
            lower.add(higher.poll());
        }

        // make sure it is ordered correctly
        if (lower.size() > 0) {
            if (higher.peek() < lower.peek()) {
                int temp = higher.poll();
                higher.add(lower.poll());
                lower.add(temp);
            }
        }
    }

    public double getMidNumber() {
        if (higher.isEmpty()) {
            System.out.println("Error: empty");
            return 0;
        }
        if (lower.size() < higher.size()) {
            return higher.peek();
        } else {
            return (double) (lower.peek() + higher.peek()) / 2;
        }
    }
}