package epam_java_online.chapter5;

import java.util.HashMap;

public class task_1_1 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №5, ЗАДАНИЕ №1.1");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать объект класса Текстовый файл, используя классы Файл, " +
                "Директория. Методы: создать, переименовать, выввести на консоль содержимое, дополнить, удалить.");

        TxtFile txt1 = new TxtFile("txt");
        txt1.addText("bla bla. La La");
        txt1.addText("la la. sLa sLa");

        Directory dir = new Directory("my_dir");
        dir.createFile(txt1);

        dir.printInfo("txt");

    }


}

// Базовый класс - Файл
abstract class File {

    // Имя файла
    String name;

    File(String name) {
        this.name = name;
    }

    // Изменение имени
    public void changeName(String name) {
        this.name = name;
    }
}

// Класс - текстовый файл
class TxtFile extends File {

    // содержание текста
    String text;

    TxtFile(String name) {
        super(name);
    }

    // добавление тескста
    public void addText(String str) {
        if(text != null) {
            text += str;
        } else {
            text = str;
        }

    }

    // печать содержимого
    public void printTxt() {
        System.out.println(text);
    }
}

// Класс директории
class Directory {

    // Список файлов
    HashMap<String, File> fileList = new HashMap<String, File>();

    // имя директории
    String name;

    Directory(String name) {
        this.name = name;
    }

    // Добавить файл
    public void createFile(File file) {
        fileList.put(file.name, file);
    }

    // Удалить файл
    public void deleteFile(String name) {
        fileList.remove(name);
    }

    // Переименовать файл
    public void renameFile(String name, String newName) {
        File file = fileList.get(name);
        fileList.remove(name);
        file.changeName(newName);
        fileList.put(file.name, file);
    }

    public void printInfo(String name) {
        TxtFile txtFile = (TxtFile) fileList.get(name);
        txtFile.printTxt();
    }


}
