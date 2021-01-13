package epam_java_online.chapter4;

import java.util.ArrayList;

public class task_2_1 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №2.1");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать объект класса Текста, используя классы Предложение, Слово. Методы: Дополнить текст, вывести текст, вывести заголовок.");
        System.out.println(" -----------------------------------------------");

        // Создаем текст
        World title = new World("Крутой текст.");

        ArrayList<World> worlds_1 = new ArrayList<World>();
        worlds_1.add(new World("Привет "));
        worlds_1.add(new World("тебе "));
        worlds_1.add(new World("из будующего"));
        worlds_1.add(new World("."));

        Sentence sentence_1 = new Sentence(worlds_1);

        Text text = new Text(title, sentence_1);

        Sentence sentence_2 = new Sentence(new World(" Вот"));
        sentence_2.addWorld(new World(" такой "));
        sentence_2.addWorld(new World("текст"));
        sentence_2.addWorld(new World("!"));

        text.addSentence(sentence_2);

        text.printTitle();
        text.printText();

    }

}

// Класс для описания слова
class World {
    public String world;

    World(String world) {
        this.world = world;
    }
}

// Класс для описания предложения
class Sentence {
    public ArrayList<World> sentence;

    Sentence(World world) {
        sentence = new ArrayList<World>();
        sentence.add(world);
    }

    Sentence(ArrayList<World> sentence) {
        this.sentence = sentence;
    }

    // метод добавления слов в предложение
    public void addWorld(World world) {
        sentence.add(world);
    }
}

// Класс для описания Текста
class Text {
    public ArrayList<Sentence> sentences;
    public World title;

    Text(World title) {
        this.sentences = new ArrayList<Sentence>();
        this.title = title;
    }

    Text(World title, Sentence sentence) {
        this.title = title;
        this.sentences = new ArrayList<Sentence>();
        this.sentences.add(sentence);
    }

    public void addSentence(Sentence sentence) {
        this.sentences.add(sentence);
    }

    public void printTitle() {
        System.out.println("Заголовок текста: " + title.world);
    }

    public void printText() {
        System.out.println("Печать текста: ");
        for (Sentence sentence: sentences){
            for (World world: sentence.sentence) {
                System.out.print(world.world);
            }
        }
        System.out.println();
        System.out.println("---------КОНЕЦ---------");
    }

}
