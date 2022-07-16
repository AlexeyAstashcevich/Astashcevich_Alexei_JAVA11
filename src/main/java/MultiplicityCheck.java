import java.util.Arrays;
import java.util.Scanner;

public class MultiplicityCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a length of array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input a number in array: ");
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(getOnlyMultiplesOfThree(array)));
    }

    private static int[] getOnlyMultiplesOfThree(int[] array) {
        return Arrays.stream(array)
                .filter(x -> x % 3 == 0)
                .toArray();
    }
}

