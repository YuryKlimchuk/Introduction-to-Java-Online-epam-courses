package epam_java_online.chapter4;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class task_2_4 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №2.4");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета." +
                "Реализовать поиск и сортировку счетов. Вычисления общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отедльно.");
        System.out.println(" -----------------------------------------------");

        // Генерируем счета
        Client client = new Client("KLIMCHUK Y.V.");

        for (int i = 0; i < 10; i++) {
            client.accounts.add(new Account(
                        i + 100,
                        1000 - ThreadLocalRandom.current().nextInt(0, 2000),
                        (ThreadLocalRandom.current().nextInt(0, 10) > 4)
                    )
            );
        }
        System.out.println("СЧЕТА ДО СОРТИРОВКИ");
        client.printInfo();
        System.out.println(" -----------------------------------------------");
        client.printBalance();
        System.out.println(" -----------------------------------------------");
        client.printPositiveBalance();
        System.out.println(" -----------------------------------------------");
        client.printNegativeBalance();
        System.out.println(" -----------------------------------------------");
        client.findAccountByNumber(132);
        client.findAccountByNumber(102);
        System.out.println(" -----------------------------------------------");
        System.out.println(" Печать после сортировки");
        client.sortByBalance();
        client.printInfo();
    }

}

// Счет
class Account {

    // номер
    int number;

    // баланс
    float balance;

    // статус блокировки
    private boolean status;

    public Account(int number, float balance, boolean status) {
        this.number = number;
        this.balance = balance;
        this.status = status;
    }

    // Установка блокировки
    public void setLock(boolean flag) {
        status = flag;
    }

    // Получить состояния блокировки
    public boolean getLock() {
        return status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                ", status=" + status +
                '}';
    }
}


// Клиент банка
class Client {

    // Имя клиент
    String clientName;

    // Массив счетов
    ArrayList<Account> accounts = new ArrayList<Account>();

    public Client(String clientName) {
        this.clientName = clientName;
    }


    // Вывод на печать счета
    public void printInfo() {
        for (Account account: accounts) {
            System.out.println(account.toString());
        }
    }


    // Суммарный баланс по счетам
    public void printBalance() {
        float balance = 0f;
        for (Account account: accounts) {
            balance += account.balance;
        }
        System.out.println("ОБЩИЙ БАЛАНС : " + balance);
    }

    // Суммарный положительный баланс
    public void printPositiveBalance() {
        float balance = 0f;
        for (Account account: accounts) {
            if(account.balance > 0) {
                balance += account.balance;
            }
        }
        System.out.println("Положительный БАЛАНС : " + balance);
    }

    // Суммарный отрицательный баланс
    public void printNegativeBalance() {
        float balance = 0f;
        for (Account account: accounts) {
            if(account.balance < 0) {
                balance += account.balance;
            }
        }
        System.out.println("Отрицательный БАЛАНС : " + balance);
    }

    // Поиск счета по номеру
    public void findAccountByNumber(int ID) {
        Account account = null;
        for (Account _account: accounts) {
            if(_account.number == ID) {
                account = _account;
                break;
            }
        }

        if(account != null){
            System.out.println("Cчет с номером " + ID + " найден: " + account.toString());
        } else {
            System.out.println("Cчет с номером " + ID + " НЕ найден");
        }
    }

    // Сортировка по балансу
    public void sortByBalance() {
        Account buffer;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < (accounts.size() - 1); i++) {
                if(accounts.get(i+1).balance < accounts.get(i).balance) {
                    buffer = accounts.get(i);
                    accounts.set(i,accounts.get(i+1));
                    accounts.set(i + 1,buffer);
                    flag = true;
                }
            }
        }
    }


}
