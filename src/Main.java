public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        String firstName = "для хранения имени";
        firstName = " Ivan";
        String middleName = "для хранения отчества";
        middleName = " Ivanovich";
        String lastName = "для хранения фамилии";
        lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);

        System.out.println("task2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("task3");
        fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameTrue);
    }
}