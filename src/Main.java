import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dish dish1 = new FirstCourse();
        Dish dish2 = new MainCourse();
        Dish dish3 = new Dessert();

        while (true) {
            System.out.println("Choose a dish classification:\n1. First courses\n2. Main courses \n3. Desserts\n4. Exit\n");
            int x = scanner.nextInt();

            switch (x) {
                case 1:
                    dish1.dishName();
                    break;
                case 2:
                    dish2.dishName();
                    break;
                case 3:
                    dish3.dishName();
                    break;
                case 4: System. exit(0);
                    break;
                default:
                    System.out.println("Wrong dish classification!\n");
                    break;
            }
        }
    }
}