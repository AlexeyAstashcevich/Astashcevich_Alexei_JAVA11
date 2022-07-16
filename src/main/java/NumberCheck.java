import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = in.nextInt();
        checkNumberAndPrint(number);
    }

    private static void checkNumberAndPrint(int number) {
        if (number > 7) {
            System.out.println("Hello");
        }
    }
}
