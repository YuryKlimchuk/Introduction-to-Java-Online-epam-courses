package epam_java_online.chapter5.DragonAndTreasure;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import epam_java_online.chapter5.DragonAndTreasure.Jewel.JewelStorage;
import epam_java_online.chapter5.DragonAndTreasure.Menu.Command;
import epam_java_online.chapter5.DragonAndTreasure.Menu.Menu;

public class Start {

    JewelStorage jewelStorage;

    public static void main(String[] args) throws IOException {
        System.out.println(" ЧАСТЬ №5, ЗАДАНИЕ №1.4");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать программу, позволяющую обрабатывать сведения об 100 сокровищах в " +
                "пещере дракона. Реализовать возможность просмотра сокровищ, выбора самого дорого " +
                "по стоимости сокровища и выбора сокровищ на заданную сумму.");
        System.out.println();

        // Хранилище сокровищ
        JewelStorage jewelStorage = new JewelStorage(100);

        // Список с командами меню
        HashMap<Integer, Command> menuCommands = new HashMap<Integer, Command>();

        menuCommands.put(1, new Command() {
            @Override
            public void execute(JewelStorage jewelStorage) {
                jewelStorage.printStorageInfo();
            }
        });

        menuCommands.put(2, new Command() {
            @Override
            public void execute(JewelStorage jewelStorage) {
                jewelStorage.printMaxCostJewel();
            }
        });

        menuCommands.put(3, new Command() {
            @Override
            public void execute(JewelStorage jewelStorage) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите сумму: ");
                jewelStorage.getJewelsForCost(scanner.nextInt());
            }
        });

        // иницилизация меню
        Menu menu = new Menu();
        int selection;

        do {
            selection = menu.showMainMenu();
            System.out.println("---------------------------------------------");
            System.out.println("Введенное значение: " + selection);
            if((selection >= 1) && (selection <=3)) menuCommands.get(selection).execute(jewelStorage);
        } while ((selection >= 1) && (selection <=3));
    }

}
