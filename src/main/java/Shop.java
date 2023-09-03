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
        toyList.set(index, new Toy(toy.getId(), toy.getName(), toy.getCount(), newWeight));
        return toy; // Возвращаем игрушку
    }

    public Toy randomToy() {
        Random random = new Random();
        int index = random.nextInt(toyList.size());
        return toyList.get(index);
    }

    public void organizeDraw() {
        Toy prize = randomToy();
        double sumWeight = 0.0;
        for (Toy toy : toyList) {
            sumWeight += toy.getWeight();
            if (toy == prize) {
                continue;
            }
            else {
                toy.setWeight((sumWeight / toyList.size()) * 100);
            }
        }
    }

//    public String getPrize(){
//        return "Congratulations! You won " + prize.getName() + " with id " + prize.getId();
//    }
}
