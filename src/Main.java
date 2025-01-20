import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int cash = 22_888;
        int bonus = 20;
            int miless = cash/bonus;

        for (String s : Arrays.asList("Вам добавлены " + miless, " мили (миль)!")) {
            System.out.print(s);
        }

    }
}