package Database;

import Animals.Animal;
import Animals.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DB {
    private final List<Animal>animals;
    private static final String FILE_PATH = "Database/db.txt";

    public DB() {
        animals = new ArrayList<>();
        dbLoad();
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
        dbSave();
    }
    public void animalCommand(String name){
        for (Animal animal:animals){
            if (animal.getName().equals(name)){
                animal.commands();
                return;
            }
        }
        System.out.println("Такое животное не найдено");
    }

    public void teachNewCommand(String name, String newCommand){
        for (Animal animal:animals){
            if (animal.getName().equals(name)){
                String[]commands = newCommand.split(",");
                for (int i = 0; i < commands.length; i++) {
                    String splittedCommand = commands[i].trim();
                    commands[i] = splittedCommand;
                }
                animal.teachNewCommand(newCommand);
                dbSave();
                return;
            }
        }
        System.out.println("Такое животное не найдено");
    }

    private void dbLoad() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 3) {
                    String className = data[0];
                    String name = data[1];
                    String skills = String.join(",", Arrays.copyOfRange(data, 2, data.length));

                    Animal animal;
                    switch (className) {
                        case "Cat" -> animal = new Cat(name, skills, "Домашнее животное");
                        case "Dog" -> animal = new Dog(name, skills, "Домашнее животное");
                        case "Hamster" -> animal = new Hamster(name, skills, "Домашнее животное");
                        case "Horse" -> animal = new Horse(name, skills, "Вьючное животное");
                        case "Camel" -> animal = new Camel(name, skills, "Вьючное животное");
                        case "Donkey" -> animal = new Donkey(name, skills, "Вьючное животное");
                        default -> {
                            System.out.println("Неизвестный класс животного: " + className);
                            continue;
                        }
                    }
                    animals.add(animal);

                } else {
                    System.out.println("Некорректные данные в файле " + line);
                }
            }
            System.out.println("Данные загружены");
        } catch (IOException e) {
            System.out.println("Ошибка при попытке прочтения данных: " + e.getMessage());
        }
    }
    public void allAnimals() {
        try {
            File file = new File(FILE_PATH);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String animalData = fileScanner.nextLine();
                System.out.println(animalData);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл с данными не найден.");
        }
    }
    private void dbSave(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, StandardCharsets.UTF_8))){
            for (Animal animal:animals) {
                String className = animal.getClass().getSimpleName();
                String name = animal.getName();
                String skills = animal.getSkills().replaceAll(",\\s+", ",");

                String line = className + "," + name + "," + skills;
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Данные сохранены");
        } catch (IOException e) {
            System.out.println("При попытке сохранения данных произошла ошибка: " + e.getMessage());
        }
    }

}
