import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();

        Set<String> weekDays = new HashSet<>();
        weekDays.add("Montag");
        weekDays.add("Dinstag");

        Set<String> weekens = new HashSet<>();
        weekens.add("Sohntag");

        if (weekDays.contains(dayOfWeek)){
            System.out.println("arbeit");
        }else if (weekens.contains(dayOfWeek)) {
            System.out.println("End");
        }else {
            System.out.println("Feller");
        }

    }
}
