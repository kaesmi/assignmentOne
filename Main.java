import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        MinimumFinder minimumFinder = new MinimumFinder();
        int minimum = minimumFinder.findMinimum(array);
        System.out.println(minimum);

        scanner.close();
    }
}