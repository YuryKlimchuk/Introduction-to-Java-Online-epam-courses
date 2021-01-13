package epam_java_online.chapter4;

import java.util.ArrayList;

public class task_2_3 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №2.3");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать объект класса Государство, используя классы Область, Район, Город. " +
                "Методы: вывести на консоль столицу, количество областей, площадь, областные центры.");
        System.out.println(" -----------------------------------------------");

        City minsk = new City("MINSK");
        City fanipol = new City("FANIPOL");
        City borisov = new City("BORISOV");
        City zodino = new City("ZODINO");
        City stambul = new City("STAMBUL");

        District minskDistr = new District("MINSKI", minsk);
        minskDistr.cities.add(fanipol);
        minskDistr.cities.add(minsk);

        District borisovDistr = new District("BORISOVCKI", borisov);
        borisovDistr.cities.add(borisov);
        borisovDistr.cities.add(zodino);
        borisovDistr.cities.add(stambul);

        Region bestRegion = new Region("BEST_REGION", minsk, 500);
        bestRegion.districts.add(minskDistr);
        bestRegion.districts.add(borisovDistr);

        Government belarus = new Government("BELKA", minsk);
        belarus.regions.add(bestRegion);

        belarus.printCapitalName();
        belarus.printCountOfRegions();
        belarus.printFullArea();

    }

}

// Интерфейс вывода в консоль названия территориальное единицы
interface PrintName {
    public void printName();
}

// Класс для описания Города
class City implements PrintName{

    // Название
    String city;

    City(String city) {
        this.city = city;
    }

    @Override
    public void printName() {
        System.out.println("Название города : " + city);
    }

}


// Класс для описания района
class District implements PrintName{

    // Название
    String district;

    // Районный центр
    City mainCity;

    // Список городов
    ArrayList<City> cities = new ArrayList<City>();

    District(String district, City mainCity) {
        this.district = district;
        this.mainCity = mainCity;
    }

    @Override
    public void printName() {
        System.out.println("Название района : " + district);
    }

}

// Класс описания области
class Region implements PrintName {

    // Название
    String region;

    // Областной центр
    City mainCity;

    // Площаль области
    float area;

    // Список районов
    ArrayList<District> districts = new ArrayList<District>();

    public Region(String region, City mainCity, float area) {
        this.region = region;
        this.mainCity = mainCity;
        this.area = area;
    }

    @Override
    public void printName() {
        System.out.println("Название области : " + region);
    }

}

// Класс описания области
class Government implements PrintName {

    // Название
    String government;

    // Областной центр
    City mainCity;

    // Список районов
    ArrayList<Region> regions = new ArrayList<Region>();


    public Government(String government, City mainCity) {
        this.government = government;
        this.mainCity = mainCity;
    }

    @Override
    public void printName() {
        System.out.println("Название государства : " + government);
    }

    // Вывод названия столицы
    public void printCapitalName() {
        System.out.println("Столица : " + mainCity.city);
    }

    // Вывод количества областей
    public void printCountOfRegions() {
        System.out.println("Количество областей : " + regions.size());
    }

    // Площадь государства
    public void printFullArea() {
        float area = 0;
        for (Region region: regions) {
            area += region.area;
        }
        System.out.println("Площадь государства : " + area);
    }

}


