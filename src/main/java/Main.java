import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(Text.menu());
            int choice = in.nextInt();
            int id;
            switch (choice) {
                case 1:
                    System.out.println(Text.parameters());
                    id = in.nextInt();
                    String name = in.next();
                    int count = in.nextInt();
                    double weight = in.nextDouble() / 100.0;
                    shop.addToy(new Toy(id, name, count, weight));
                    break;
                default:
                    return;
            }
        }
    }
}