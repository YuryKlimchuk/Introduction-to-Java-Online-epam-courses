package epam_java_online.chapter5.DragonAndTreasure.Jewel;


// Описание сокровища
public class Jewel {

    // Стоимость
    private int cost;

    // Имя
    private String name;

    public Jewel(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Jewel{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
