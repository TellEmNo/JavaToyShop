import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ArrayList<Prize> winnersToys = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println(Text.announcement);
        while (true) {
            System.out.println(Text.menu());
            int choice = in.nextInt();
            int id;
            switch (choice) {
                case 1:
                    System.out.println(Text.parameters());
//                    id = in.nextInt();
//                    String name = in.next();
//                    double weight = in.nextDouble();
//                    shop.addToy(new Toy(id, name, weight));
                    // Просто, чтобы не заполнять
                    shop.addToy(new Toy(0, "Машинка", 40));
                    shop.addToy(new Toy(1, "Кукла Барби", 30));
                    shop.addToy(new Toy(2, "Набор для рисования", 20));
                    shop.addToy(new Toy(3, "Лего", 10));
                    shop.addToy(new Toy(4, "Робот", 8));
                    shop.addToy(new Toy(5, "Книга о приключениях", 7));
                    shop.addToy(new Toy(6, "Монополия", 6));
                    shop.addToy(new Toy(7, "Мягкая игрушка Микки Маус", 5));
                    shop.addToy(new Toy(8, "Шоколадный набор", 4));
                    shop.addToy(new Toy(9, "Карнавальный костюм", 3));
                    break;
                case 2:
                    shop.printToys();
                    break;
                case 3:
                    Prize prize = new Prize();
                    Toy toy = new Toy(0, "", 0);
                    try {
                    toy = shop.organizeDraw();
                    prize.setPrizeId(toy.getId());
                    prize.setPrizeName(toy.getName());
                    winnersToys.add(prize);
                    recordWinToys(winnersToys);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (NullPointerException | IndexOutOfBoundsException e) {
                        e.getMessage();
                    }
                    break;
                case 4:
                    for (Prize prize1: winnersToys){
                        System.out.println("Приз: " + prize1.getPrizeName()+ " c id:" + prize1.getPrizeId() + "!");
                    }
                    break;
                default:
                    return;
            }
        }
    }
    public static void recordWinToys(ArrayList<Prize> winnersToys) throws IOException {
        FileWriter writer = new FileWriter("Prizes.txt", StandardCharsets.UTF_8);
        for (Prize toy : winnersToys) {
            writer.write(toy.getPrizeName() + ": id " + toy.getPrizeId() + "\n");
        }
        writer.close();
    }
}