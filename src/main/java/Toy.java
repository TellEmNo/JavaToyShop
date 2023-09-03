public class Toy {
    private int id;
    private String name;
    private int count;
    private double weight;

    public Toy(int id, String name, int count, double weight) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.weight = weight / 100.0;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public int getId() {
        return id;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

//    public void setCount(int count) {
//        this.count = count;
//    }

    public int getCount() {
        return count;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
