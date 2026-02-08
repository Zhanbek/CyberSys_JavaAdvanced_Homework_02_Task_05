import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> favoriteDishes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.print("Введіть ваше улюблене блюдо або рядок \"end\" для завершення програми: ");
        String dish = scanner.next();

        while (!dish.equalsIgnoreCase("end")) {
            favoriteDishes.add(dish);
            System.out.print("Введіть ваше улюблене блюдо або рядок \"end\" для завершення програми: ");
            dish = scanner.next();
        }

        System.out.println();
        System.out.println("Ваші улюблені страви: ");
        for (String dishName : favoriteDishes) {
            System.out.println(dishName);
        }
    }
}