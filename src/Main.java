import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
    }

    public static int[] generateRandomArray(int startValue, int dispersion, int numberOfElements) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[numberOfElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(dispersion) + startValue;
        }
        return arr;
    }


    private static void Task1() {
        System.out.println("\nЗадача 1:");
        int[] arr = generateRandomArray(100_000, 100_000, 30);
        System.out.println(Arrays.toString(arr));
        long sum = 0;
        for (int element:arr)
            sum += element;
        System.out.println ("Сумма трат за месяц составила " + sum + " рублей");
    }

    private static void Task2() {
        System.out.println("\nЗадача 2:");
        int[] arr = generateRandomArray(100_000, 100_000, 30);
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int element:arr) {
            if (min > element) min = element;
            if (max < element) max = element;
        }
        System.out.println ("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Максимальная сумма трат за день составила " + max + " рублей");
    }

    private static void Task3() {
        System.out.println("\nЗадача 3:");
        int[] arr = generateRandomArray(100_000, 100_000, 30);
        System.out.println(Arrays.toString(arr));
        long sum = 0;
        for (int element:arr)
            sum += element;
        float averagePerDay = sum / 30f;
        System.out.println ("Средняя сумма трат в день за месяц составила "+ averagePerDay +" рублей");
    }

    private static void Task4() {
        System.out.println("\nЗадача 4:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int lastIndex = reverseFullName.length-1;
        for (int i = 0; i < reverseFullName.length; i++)
            System.out.print(reverseFullName[lastIndex-i]);
    }
}