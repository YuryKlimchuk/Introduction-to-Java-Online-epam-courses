package epam_java_online.chapter4;

public class task_1_3 {

    public static void main(String[] args) {
        System.out.println(" ЧАСТЬ №4, ЗАДАНИЕ №1.3");
        System.out.println(" ЗАДАНИЕ:");
        System.out.println(" Создать класс Student, содержащий поля: Фамилия, Инициалы, номер группы, успеваемость (массив из 5 элементов). " +
                            "Создать массив из 10 элементов типа Student. " +
                            "Создать метод каторый выводит фамилии и номера групп студентов которые учаться на 9 и 10.");
        System.out.println(" -----------------------------------------------");

        // Создадае массив из 10 переменных типа Student
        String[] surnames = {"Ivanov", "Sidarov", "Petrovich", "Demidovich", "Klimchuk", "Mazanov", "Masherov", "Tihanovski", "Smirnov", "Labanov"};
        String[] initialss = {"A.V.", "U.V.", "K.M.", "M.B."};
        int[] groups = {101717, 101727, 101732, 101700};
        int[][] marks = {
                {9, 5, 7, 8, 10},
                {9, 9, 9, 9, 9},
                {6, 7, 8, 8, 6},
                {9, 10 , 9, 9, 9}
        };
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            students[i] = new Student(
                    surnames[i],
                    initialss[(int) (Math.random() * 4)],
                    groups[(int) (Math.random() * 4)],
                    marks[(int) (Math.random() * 4)]);
        }
        // ----------------------------------------------
        // ищем студентов отличников
        findExcellentStudent(students);


    }

    // Метод поиска студентов с оценками 9 и 10
    public static void findExcellentStudent(Student[] _students) {
        for (Student student: _students) {
            boolean flag = true;
            for (int i = 0; i < student.marks.length; i++) {
                if(student.marks[i] < 9) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println("СТУДЕНТ ОТЛИЧНИК");
                System.out.println("Фамилия: " + student.surname);
                System.out.println("Инициалы: " + student.initials);
                System.out.println("Номер группы: " + student.groupNumber);
                System.out.println(" -----------------------------------------------");
            }
        }
    }
}

class Student {
    String surname;
    String initials;
    int groupNumber;
    int[] marks = new int[5];

    public Student(String _surname, String _initials, int _groupNumber, int[] _marks) {
        this.surname = _surname;
        this.initials = _initials;
        this.groupNumber = _groupNumber;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = _marks[i];
        }
    }

}
