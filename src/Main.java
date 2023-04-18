public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich ";
        String fullName = middleName + firstName + lastName;
        System.out.println("Имя сотрудника - " + fullName);

    }

    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(fullName.toUpperCase());
    }
}