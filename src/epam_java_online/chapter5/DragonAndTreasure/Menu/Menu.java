package epam_java_online.chapter5.DragonAndTreasure.Menu;


import java.io.IOException;
import java.util.Scanner;

// Класс отвечающий за меню
public class Menu {

    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public int showMainMenu() {
        System.out.println("---------------------------------------------");
        System.out.println("ГЛАВНОЕ МЕНЮ");
        System.out.println("1 - Просмотр содержимого сокровищей.");
        System.out.println("2 - Просмотр самого дорого сокровища.");
        System.out.println("3 - Выбор сокровищей на заданную сумму.");
        System.out.println("4 - Выход.");

        return scanner.nextInt();
    }
}
