import java.util.Objects;
import java.util.Scanner;

public class NameCheck {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Input name: ");
            String name = in.nextLine();
            System.out.println(modifyName(name));
        }
    }

    private static String modifyName(String name) {
        return Objects.nonNull(name) && name.equals("Вячеслав")
                ? "Привет, Вячеслав"
                : "Нет такого имени";
    }
}
