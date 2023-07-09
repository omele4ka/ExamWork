package ProgramMenu;

import Animals.Animal;
import Animals.*;
import Database.DB;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    private final Scanner scanner;
    private final DB db;

    public Menu(DB db){
        this.db = db;
        scanner = new Scanner(System.in);
    }

    public void mainMenu() {
        while (true) {
            try{
                System.out.println("\nМЕНЮ:\n" +
                        "1. Завести новое животное\n" +
                        "2. Вывести полный список животных\n" +
                        "3. Вывести список команд животного\n" +
                        "4. Обучить животное новой команде\n" +
                        "0. Выйти из программы\n" +
                        "Выберите пункт меню: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> addNewAnimal();
                    case 2 -> db.allAnimals();
                    case 3 -> animalCommands();
                    case 4 -> teachNewCommand();
                    case 0 -> {
                        System.out.println("До новых втреч!");
                        return;
                    }
                    default -> System.out.println("Неверный ввод. Попробуйте снова");
                }
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод. Попробуйте снова");
                scanner.nextLine();
            }
        }
    }

    private void addNewAnimal(){
        System.out.println("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.println("Введите команды через запятую: ");
        String skills = scanner.nextLine();
        System.out.println("Выберите вид животного:\n" +
                "1. Кот\n" +
                "2. Собака\n" +
                "3. Хомяк\n" +
                "4. Лошадь\n" +
                "5. Верблюд\n" +
                "6. Осел");
        int animalClass = scanner.nextInt();
        scanner.nextLine();

        Animal animal;
        switch (animalClass){
            case 1 -> animal = new Cat(name, skills, "Домашнее животное");
            case 2 -> animal = new Dog(name, skills, "Домашнее животное");
            case 3 -> animal = new Hamster(name, skills, "Домашнее животное");
            case 4 -> animal = new Horse(name, skills, "Вьючное животное");
            case 5 -> animal = new Camel(name, skills, "Вьючное животное");
            case 6 -> animal = new Donkey(name, skills, "Вьючное животное");
            default -> {
                System.out.println("Неверный ввод. Попробуйте снова.");
                return;
            }
        }
        db.addAnimal(animal);
        System.out.println("Данные внесены и сохранены");
    }
    private void animalCommands(){
        System.out.println("Введите имя животного: ");
        String name = scanner.nextLine();
        db.animalCommand(name);
    }

    private void teachNewCommand(){
        System.out.println("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.print("Введите новые команды через запятую: ");
        String command = scanner.nextLine();

        db.teachNewCommand(name, command);
        System.out.println("Данные внесены и сохранены");
    }
}
