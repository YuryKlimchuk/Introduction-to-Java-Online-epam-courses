package epam_java_online.chapter5.DragonAndTreasure.Jewel;

// генератор сокровищ
public class JewelGenerator {

    private String[] names;
    private int[] costs;

    JewelGenerator(String[] names, int[] costs){
        this.names = names;
        this.costs = costs;
    }

    // Генерирует объект типо Jewel (сокровище)
    public Jewel generateJewel(int flag) {
        return new Jewel(costs[flag], names[flag]);
    }

}
