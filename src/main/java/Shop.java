import java.util.ArrayList;
import java.util.Random;


public class Shop {
    private ArrayList<Toy> toyList;
    public Shop() {
        toyList = new ArrayList<Toy>();
    }

    public void addToy(Toy toy){
        if (!isDouble(String.valueOf(toy.getWeight()))) {
            throw new IllegalArgumentException(Text.error);
        }
        toyList.add(toy);
    }

    private static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public Toy changeWeight(int index, double newWeight) {
        Toy toy = toyList.get(index); // Получаем игрушку
        toyList.set(index, new Toy(toy.getId(), toy.getName(), newWeight));
        return toy; // Возвращаем игрушку
    }

    public void printToys(){
        for (Toy toy : toyList) {
            System.out.println(toy.getName());
        }
    }

    public Toy organizeDraw() {
        Toy winner = new Toy(0, "", 0);
        Random random = new Random();
        double sumWeight = 0.0;
        try {
            for (Toy toy : toyList) {
                sumWeight += toy.getWeight();
            }
            double randomWeight = random.nextDouble(0, sumWeight / 100);
            for (int i = 0; i < toyList.size() - 1; i++) {
                double chance = toyList.get(i).getWeight() / sumWeight;
                if (randomWeight >= chance) {
                    System.out.println(Text.win + toyList.get(i).getName() + "\n");
                    winner = toyList.get(i);
                    toyList.remove(i);
                    System.out.println(sumWeight);
                    return winner;
                }
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.out.println(Text.error2);
        }
        return null;
    }
}
