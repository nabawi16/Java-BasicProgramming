import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        int[] values = { 1, 2, 1, 2, 3, 4, 5, 5};
        System.out.println();duplicate(values);
    }

    public static void duplicate(int numbers[]) {
        Arrays.sort(numbers);
        int previous = numbers[0] - 1;
        ;
        int dupCount = 0;

        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] == previous) {
                ++dupCount;
            } else {
                previous = numbers[i];
            }
        }
        System.out.println("Jumlah yang terduplikasi adalah " + dupCount + " nomor.");

    }
}
