// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("\n" + "Задача 1" + "\n");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("\n" + "Задача 2" + "\n");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчёта — " + fullName.toUpperCase());
    }

    public static void task3(){
        System.out.println("\n" + "Задача 3" + "\n");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника  — " + fullName.replace("ё", "е"));
    }
}
