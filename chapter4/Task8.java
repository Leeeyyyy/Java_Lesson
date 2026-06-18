package chapter4;

public class Task8 {
    public static int calculate(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            totalSum += num;

            int cumulativeSum = 0;

            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }

            System.out.println(num + " = " + cumulativeSum);
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int total = calculate(4, 5, 10);
        System.out.println("Total of all parameters = " + total);
    }
}
