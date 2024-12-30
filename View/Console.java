package View;

import Presenter.Presenter;

import java.util.Scanner;

public class Console {

    private Presenter presenter;
    private Scanner scanner;
    private boolean exit;

    public Console() {
        this.exit = true;
        this.presenter = new Presenter();
    }

    public void start() {
        while (exit) {
            showMenu();
            scanner = new Scanner(System.in);
            String used = scanner.nextLine();
            switch (used) {
                case "1":
                    input();
                    break;
                case "2":
                    presenter.showDiretory();
                    break;
                case "3":
                    presenter.deleteRecord();
                    break;
                case "4":
                    presenter.clearDirectory();
                    break;
                case "5":
                    exit = false;
                    break;
                default:
                    System.out.println("Некорректный ввод данных! Повторите ввод");
                    break;
            }
        }
    }

    private static void showMenu() {
        System.out.println("Здравствуйте! Вы открыли телефонный справочник, выбирите действие \n" +
                "1. Добавить запись \n" +
                "2. Вывести все записи \n" +
                "3. Удалить запись \n" +
                "4. Очистить справочник \n" +
                "5. Закрыть справочник");
    }

    private void input() {
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию");
        String surname = scanner.nextLine();
        System.out.println("Введите дату рождения");
        System.out.println("Пример: 19.04.1998");
        String date = scanner.nextLine();
        System.out.println("Введите номер телефона");
        String phone = scanner.nextLine();
        System.out.println("Введите пол");
        String sex = scanner.nextLine();
        presenter.addRecord(name, surname, date, phone, sex);
        scanner.nextLine();
    }
}
