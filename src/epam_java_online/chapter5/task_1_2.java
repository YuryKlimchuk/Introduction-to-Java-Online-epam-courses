package epam_java_online.chapter5;

import java.util.ArrayList;
import java.util.HashMap;

public class task_1_2 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №5, ЗАДАНИЕ №1.2");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать класс Payment с внутренним классом, " +
                "с помощью которого можно сформировать покупку из несколькхи товаров.");

        Payment payment1 = new Payment();
        payment1.addProduct(3.5f, "Apple");
        payment1.addProduct(1.5f, "Milk");
        payment1.addProduct(4.5f, "Meat");
        payment1.addProduct(3.5f, "Fish");

        System.out.println("Стоимость всех покупок: " + payment1.getAllPrice());

    }
}


// Платеж
class Payment {

    // Товар
    class Product {

        // Цена
        float price;

        // Наименование
        String name;

        public Product(float price, String name) {
            this.price = price;
            this.name = name;
        }
    }

    // Список покупок
    private ArrayList<Product> productList = new ArrayList<Product>();

    // добавление товара в список
    public void addProduct(float price, String name) {
            productList.add(new Payment.Product(price, name));
    }

    // стоимость всех товаров
    public float getAllPrice() {
        float price = 0f;
        for (Payment.Product product: productList) {
            price += product.price;
        }
        return price;
    }

}

