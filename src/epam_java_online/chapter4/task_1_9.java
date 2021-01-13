package epam_java_online.chapter4;

public class task_1_9 {

    final static String[] names = {"Summer", "Great War", "Robin Hood", "History of Country", "University"};
    final static String[] company = {"MinskBoos", "WarsawBooks", "Independent Books", "Best Books", "Nice Books"};
    final static String[] type = {"Soft", "Hard"};
    final static String[] authors = {"Pyshkin", "Lermantov", "Kypala", "Kolos", "Bykov"};


    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №1.9");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать класс Book, спецификация которого приведена ниже. Определить конструкторы," +
                " сет и гет методы. и метод toString(). Создать второй класс, агрегирующий массив типа Book, " +
                "с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль." +
                "Класс Book: id, название, автор, издательство, год издания, кол. страниц, цена, тип переплета." +
                "Найти и вывести: список книг заданного автора, список книг выпушенных заданным издательством, список книг выпушенных после заданого года.");
        System.out.println(" -----------------------------------------------");

        BookAdapter bookAdapter = new BookAdapter(15);
        bookAdapter.printBooks();

        System.out.println(" -----------------------------------------------");
        System.out.println(" поиск по автору");
        bookAdapter.findBookByAuthor(authors[(int) (Math.random() * 5)]);
        System.out.println(" -----------------------------------------------");
        System.out.println(" поиск по издательству");
        bookAdapter.findBookByCompany(company[(int) (Math.random() * 5)]);
        System.out.println(" -----------------------------------------------");
        System.out.println(" поиск по году");
        bookAdapter.findBookByYear(2000 + (int) (Math.random() * 20));
        System.out.println(" -----------------------------------------------");

    }
}

class BookAdapter {

    Book[] books;

    // countOfBooks - количество книг в базе
    BookAdapter(int countOfBooks) {
        books = new Book[countOfBooks];
        bookGenerator();

    }

    // Генератор базы книг
    private void bookGenerator() {

        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(
                    i,
                    2000 + (int) (Math.random() * 20) ,
                    20 + (int) (Math.random() * 500),
                    20 + (int) (Math.random() * 50),
                    task_1_9.names[(int) (Math.random() * 5)],
                    task_1_9.authors[(int) (Math.random() * 5)],
                    task_1_9.company[(int) (Math.random() * 5)],
                    task_1_9.type[(int) (Math.random() * 2)]
            );
        }
    }

    // Печать базы
    public void printBooks() {
        System.out.println(" --");
        for (Book book: books) {
            System.out.println(book.toString());
        }
        System.out.println(" --");
    }

    // Вывод по автора
    public void findBookByAuthor(String _author) {
        System.out.println("Книги с автором " + _author);
        for (Book book: books) {
            if(_author.equals(book.author)) {
                System.out.println(book);
            }
        }
    }

    // Вывод по издательству
    public void findBookByCompany(String _company) {
        System.out.println("Книги от издательства" + _company);
        for (Book book: books) {
            if(_company.equals(book.company)) {
                System.out.println(book);
            }
        }
    }

    // Вывод после заданого года
    public void findBookByYear(int _year) {
        System.out.println("Книги после " + _year + " года");
        for (Book book: books) {
            if(_year < book.year) {
                System.out.println(book);
            }
        }
    }
}


// Класс описывающий книгу
class Book {
    // id, год издания, количество страниц, цена
    int id, year, countPages, price;

    // название, автор, издательство, тип переплета.
    String name, author, company, type;

    private Book(){}

    public Book(int id, int year, int countPages, int price, String name, String author, String company, String type) {
        this.id = id;
        this.year = year;
        this.countPages = countPages;
        this.price = price;
        this.name = name;
        this.author = author;
        this.company = company;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", year=" + year +
                ", countPages=" + countPages +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", company='" + company + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
