package epam_java_online.chapter4;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class task_2_5 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №2.5");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Туристические путевки. Сформировать наборпредложений клиенту по выбору туристической путевки различного типа (отдых, экскурсия, лечении, шопинг, круиз и тд." +
                " для оптимизации выбора. Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.)");
        System.out.println(" -----------------------------------------------");

        TouristPackageAdapter adapter = new TouristPackageAdapter();
        adapter.printAllInfo();

        // Запросы на поиск
        System.out.println(" -----------------------------------------------");
        // количество дней от 5 до 10
        System.out.println(" Количество дней от 5 до 10: ");
        adapter.printSelected(adapter.selectByDaysCount(adapter.touristPackages, 5, 10));
        // на поезде
        System.out.println(" На поезде : ");
        adapter.printSelected(adapter.selectByTransport(adapter.touristPackages, "TRAIN"));
        // без питания
        System.out.println(" Без питания : ");
        adapter.printSelected(adapter.selectByFood(adapter.touristPackages, 0));
        // комбинированный поиск: 3 до 15 дней, автобус, 3 разавое питание
        System.out.println(" комбинированный поиск: 3 до 15 дней, автобус, 3 разавое питание");
        adapter.complexSelect(3, 15, 3, "BUS");
        System.out.println(" сортировка по количеству дней");
        adapter.sortByDays();
        adapter.printAllInfo();
        System.out.println(" сортировка по еде");
        adapter.sortByFood();
        adapter.printAllInfo();
    }
}

// Описание тур. путевки
class TouristPackage {

    // Тип путевки и транспорта
    String packageType, transportType;

    // тип питания, 0 отсутствует, 1-3  (завтрак, завтрак + обед, завтрак + обед + ужин)
    int food;

    // количество дней
    int daysCount;

    public TouristPackage(String packageType, String transportType, int food, int daysCount) {
        this.packageType = packageType;
        this.transportType = transportType;
        this.food = food;
        this.daysCount = daysCount;
    }

    @Override
    public String toString() {
        return "TouristPackage{" +
                "packageType='" + packageType + '\'' +
                ", transportType='" + transportType + '\'' +
                ", food=" + food +
                ", daysCount=" + daysCount +
                '}';
    }
}

// Агрегиатирующий класс
class TouristPackageAdapter {

    // тип путевки
    String[] packageTypes = {
            "REST",
            "EXCURSION",
            "HEALING",
            "SHOPPING",
            "CRUISE"
    };

    // тип транспорта
    String[] transportType = {
            "BUS",
            "PLANE",
            "TRAIN"
    };



    ArrayList<TouristPackage> touristPackages = new ArrayList<TouristPackage>();

    TouristPackageAdapter() {
        generatePackage(25);
    }



    // генератор рамдомных путевок
    private void generatePackage(int count) {

        for (int i = 0; i < count; i++) {
            touristPackages.add(i,
                    new TouristPackage(
                        packageTypes[ThreadLocalRandom.current().nextInt(0, 5)],
                        transportType[ThreadLocalRandom.current().nextInt(0,3)],
                        ThreadLocalRandom.current().nextInt(0,4),
                        ThreadLocalRandom.current().nextInt(2,21)
                     )
            );
        }
    }

    // Вывод всех путевок
    public void printAllInfo() {
        System.out.println("Информация об путевках");
        for (TouristPackage touristPackage: touristPackages) {
            System.out.println(touristPackage.toString());
        }
    }

    // Вывод выборки
    public void printSelected(ArrayList<TouristPackage> selected) {
        for (TouristPackage touristPackage: selected) {
            System.out.println(touristPackage.toString());
        }
    }

    // Выбор путевок по транспорту в заднной выборке
    public ArrayList<TouristPackage> selectByTransport(ArrayList<TouristPackage> forSelect, String transportType) {
        ArrayList<TouristPackage> selected = new ArrayList<TouristPackage>();

        for (TouristPackage touristPackage: forSelect) {
            if(touristPackage.transportType.equals(transportType)) selected.add(touristPackage);
        }

        return selected;
    }

    // Выбор путевок по типу
    public ArrayList<TouristPackage> selectByType(ArrayList<TouristPackage> forSelect, String packageType) {
        ArrayList<TouristPackage> selected = new ArrayList<TouristPackage>();

        for (TouristPackage touristPackage: forSelect) {
            if(touristPackage.packageType.equals(packageType)) selected.add(touristPackage);
        }

        return selected;
    }

    // Выбор по количеству дней
    public ArrayList<TouristPackage> selectByDaysCount(ArrayList<TouristPackage> forSelect, int minDays, int maxDays) {
        ArrayList<TouristPackage> selected = new ArrayList<TouristPackage>();

        for (TouristPackage touristPackage: forSelect) {
            if(touristPackage.daysCount >= minDays && touristPackage.daysCount < maxDays)   selected.add(touristPackage);
        }

        return selected;
    }

    // Выбор по количеству дней (food принимает значения от 0 до 3 вкл.)
    public ArrayList<TouristPackage> selectByFood(ArrayList<TouristPackage> forSelect, int food) {
        ArrayList<TouristPackage> selected = new ArrayList<TouristPackage>();

        for (TouristPackage touristPackage: forSelect) {
            if(touristPackage.food == food)   selected.add(touristPackage);
        }

        return selected;
    }

    // Выбор по 3 критериям
    public void complexSelect(int minDays, int maxDays, int food, String transportType) {

        printSelected(
                selectByTransport(
                        selectByFood(
                                selectByDaysCount(touristPackages, minDays, maxDays),
                                food),
                        transportType));

    }

    // Сортиртировка по количеству дней
    public void sortByDays() {
        TouristPackage buffer;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < (touristPackages.size() - 1); i++) {
                if(touristPackages.get(i+1).daysCount < touristPackages.get(i).daysCount) {
                    buffer = touristPackages.get(i);
                    touristPackages.set(i,touristPackages.get(i+1));
                    touristPackages.set(i + 1,buffer);
                    flag = true;
                }
            }
        }
    }

    // Сортиртировка по питанию
    public void sortByFood() {
        TouristPackage buffer;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < (touristPackages.size() - 1); i++) {
                if(touristPackages.get(i+1).food < touristPackages.get(i).food) {
                    buffer = touristPackages.get(i);
                    touristPackages.set(i,touristPackages.get(i+1));
                    touristPackages.set(i + 1,buffer);
                    flag = true;
                }
            }
        }
    }

}



