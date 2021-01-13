package epam_java_online.chapter4;

public class task_1_8 {


    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №1.8");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы," +
                " сет и гет методы. и метод toString(). Создать второй класс, агрегирующий массив типа Customer, " +
                "с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль." +
                "Класс Customer: id, фамилия, имя, отчество, адрес, номер кридитки, номер банковског осчета." +
                "Найти и вывести: список покупателей в алфавитном порядке, список покупателей у которых номер кредитной карточки находиться в заданом интервале.");
        System.out.println(" -----------------------------------------------");


        CustomerAdapter customerAdapter = new CustomerAdapter(10);
        // Выводим покупателей до сортировки
        customerAdapter.printInfo();
        System.out.println(" -----------------------------------------------");
        System.out.println(" -----------------------------------------------");
        // После сортировки
        customerAdapter.surnameSort();
        customerAdapter.printInfo();
        System.out.println(" -----------------------------------------------");
        System.out.println(" Карты из диапазона 1003 - 1007");
        customerAdapter.getCustomersByCreadit(1003, 1007);
    }
}

class Customer {

    // ID, номер карты, номер счета
    int id, cardNumber, bankNumber;

    // Имя, фамилия, отчество
    String name, surname, middlename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", bankNumber=" + bankNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middlename='" + middlename + '\'' +
                '}';
    }


    Customer(int id, int cardNumber, int bankNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.bankNumber = bankNumber;
    }

    Customer(int id, int cardNumber, int bankNumber, String name, String surname, String middlename) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.bankNumber = bankNumber;
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
    }
}


class CustomerAdapter {

    Customer[] customers;

    private CustomerAdapter() {}

    CustomerAdapter(int countOfCustomers) {
        customers = new Customer[countOfCustomers];
        customersGenerator();
    }

    // Генератор массива клиентов
    private void customersGenerator() {

        String[] names = {"Nick", "Mike", "Ivan", "Gogi", "Yury", "Svetlana", "Mariya", "Anastasiya", "Boris", "Viktoriya"};
        String[] surnames = {"Ivanov", "Smith", "Pitt", "Kirkorov", "Laboda", "Stepanenko", "Klimchulk", "Aleksieevich", "Tikhanovski", "Laptev"};
        String[] middlenames = {"Valerevich", "Dmitriveick", "Andreivich", "Nikolaevich", "Stepovich", "Timoveivich", "Vasilevich", "Vladimirovich", "Ignatevich", "Karpovich"};


        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer(
                    i,
                    1000+i,
                    4567+i,
                    names[(int) (Math.random() * 10)],
                    surnames[(int) (Math.random() * 10)],
                    middlenames[(int) (Math.random() * 10)]
            );
        }
    }

    // Сортировка по фамилии
    public void surnameSort() {
        for (int i = 0; i < customers.length; i++) {

            for (int j = i + 1 ; j < customers.length; j++) {
                Customer buffer;
                if (customers[j].surname.compareTo(customers[i].surname) < 0) {
                    buffer = customers[i];
                    customers[i] = customers[j];
                    customers[j] = buffer;
                }
            }
        }
    }

    // Вывод на печать покупателей
    public void printInfo() {
        for (Customer customer: customers) {
            System.out.println(customer.toString());
            System.out.println(" -----------------------------------------------");
        }
    }

    // Вывод покупателей с картами из заданного интервала
    public void getCustomersByCreadit(int low, int high) {
        for (Customer customer: customers) {
            if((customer.cardNumber >= low) && (customer.cardNumber <= high)) {
                System.out.println(customer.toString());
            }
        }
    }


}


