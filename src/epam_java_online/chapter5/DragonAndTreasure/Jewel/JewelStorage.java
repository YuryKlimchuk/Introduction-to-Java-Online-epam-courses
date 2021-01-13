package epam_java_online.chapter5.DragonAndTreasure.Jewel;




import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import epam_java_online.chapter5.DragonAndTreasure.Constants;

// Хранилище сокровищ
public class JewelStorage {

    // Размер хранилища
    private int storageSize;

    // Хранилище
    private ArrayList<Jewel> storage = new ArrayList<Jewel>();

    public JewelStorage(int storageSize) {

        this.storageSize = storageSize;
        JewelGenerator jewelGenerator = new JewelGenerator(Constants.JEWEL_NAMES, Constants.JEWEL_COSTS);

        for (int i = 0; i < storageSize; i++) {
            storage.add(jewelGenerator.generateJewel((ThreadLocalRandom.current().nextInt(0, 10))));
        }

    }

    // Вывод информации об сокровищах
    public void printStorageInfo() {
        System.out.println("Вывод информации об хранилище.");
        System.out.println("Размер хранилища: " + storageSize);

        for (int i = 0; i < storage.size(); i++) {
            System.out.println((i + 1) + ". Название: " + storage.get(i).getName() + ". Стоимость: " + storage.get(i).getCost() + " руб.");
        }
        System.out.println(" -----------------------------------------------");
    }

    // Вывод информации об самом ценным сокровище (или несокльких)
    public void printMaxCostJewel() {
        System.out.println("Вывод информации об наиболее ценном сокровище.");

        // Ищем сокровища с максимальной стоимостью
        ArrayList<Integer> maxJewelIndex = new ArrayList<Integer>();
        int maxCost = storage.get(0).getCost();
        maxJewelIndex.add(0);

        for (int i = 1; i < storage.size(); i++) {
            if(storage.get(i).getCost() > maxCost) {
                maxCost = storage.get(i).getCost();
                maxJewelIndex.clear();
                maxJewelIndex.add(i);
            } else if(storage.get(i).getCost() == maxCost) {
                maxJewelIndex.add(i);
            }
        }
        // ------------------------------------------
        System.out.println("Количество сокровищ с максимальной стоимостью: " + maxJewelIndex.size());
        for (int i = 0; i < maxJewelIndex.size(); i++) {
            System.out.println((maxJewelIndex.get(i) + 1) + ". Название: " + storage.get(maxJewelIndex.get(i)).getName() + ". Стоимость: " + storage.get(maxJewelIndex.get(i)).getCost() + " руб.");
        }
        System.out.println(" -----------------------------------------------");
    }

    // Выводим информацию об сокровищах на заданную сумму (используем динамическое програмирование)
    public void getJewelsForCost(int cost) {
        System.out.println("Вывод информации об сокровищах на заданную сумму = " + cost + " руб.");
        int[] costs = new int[cost + 1];  // хранит суммы (индек массива), 1 - данную сумму можно образовать, 0 - нельзя
        int[] costs2 = new int[cost + 1]; // хранит элемент участвующий вобразовании даннойсуммы
        costs[0] = 1;

        for (int i = 0; i < storage.size(); i++) {
            for (int j = cost - storage.get(i).getCost(); j >= 0 ; j--) {
                if(costs[j] != 0) {
                    costs[j + storage.get(i).getCost()] = 1;
                    costs2[j + storage.get(i).getCost()] = i;
                }
            }
        }

        /*
        for (int i = 0; i < costs.length; i++ ){
            System.out.println("costs[" + i + "] = " + costs[i]);
        }
        */

        if(costs[cost] == 1) {
            System.out.println("Сумма " + cost + " получаетя из: ");
            while(cost != 0) {
                System.out.println(storage.get(costs2[cost]));
                cost = cost - storage.get(costs2[cost]).getCost();
            }
        } else {
            System.out.println("На Сумму " + cost + " не получается набрать");
        }
    }

}


    /*


            int n = 4;
        int k = 10;
        int[] arC = {6,5,3,2};
        int[] arA = new int[k+1];
        arA[0] = 1;
        for (int i = 0; i < n; i++){
            System.out.println("i = " + i);
            for (int j = k - arC[i]; j >= 0; j--){
                System.out.print("j = " + j + ";  ");
                System.out.print("arA[" + j + "] = " + arA[j] + ";  ");
                if (arA[j] != 0) {
                    arA[j + arC[i]]= 1;
                    System.out.print("arA[" + (j + arC[i]) + "] = " + arA[j + arC[i]] + ";  ");
                }
                System.out.println();
            }
            System.out.println("-------------------------------");
        }
        for (int i = 0; i <= k; i++ ){
            System.out.println("arA[" + i + "] = " + arA[i]);
        }
     */


