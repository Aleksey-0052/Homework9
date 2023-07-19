import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println( "Задача 1");

        int[] cashSpendingArray = generateRandomArray();
        int cashSpendingSum = 0;

        System.out.println(Arrays.toString(cashSpendingArray));

        for (int cashSpending: cashSpendingArray) {
            cashSpendingSum += cashSpending;
        }
        System.out.println("Сумма трат за месяц составила " + cashSpendingSum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] cashSpendingArray = generateRandomArray();

        System.out.println(Arrays.toString(cashSpendingArray));

        int maxCashSpending = cashSpendingArray[0];
        int minCashSpending = cashSpendingArray[0];

        for (int cashSpending: cashSpendingArray) {
            if (cashSpending > maxCashSpending) {
                maxCashSpending = cashSpending;
            }

            if (cashSpending < minCashSpending) {
                minCashSpending = cashSpending;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minCashSpending + " рублей. Максимальная сумма трат за день составила " + maxCashSpending + " рублей");

        Arrays.sort(cashSpendingArray);
        System.out.println(Arrays.toString(cashSpendingArray));
        System.out.println("Минимальная сумма трат за день составила " + cashSpendingArray[0] + " рублей. Максимальная сумма трат за день составила " + cashSpendingArray[29] + " рублей");
    }

    public static void task3() {
        System.out.println( "Задача 3");

        int[] cashSpendingArray = generateRandomArray();
        int cashSpendingSum = 0;
        double averageCashSpending;

        System.out.println(Arrays.toString(cashSpendingArray));

        for (double cashSpending: cashSpendingArray) {
            cashSpendingSum += cashSpending;
        }
        averageCashSpending = (double) cashSpendingSum / cashSpendingArray.length;

        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageCashSpending);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
        }
    }
}