package Animals;

public class Cat extends Animal {

    public Cat(String name, String skills, String type) {
        super(name, skills, "Домашнее животное");
    }

    @Override
    public void teachNewCommand(String newCommand) {
        String newSkills = getSkills() + newCommand;
        setSkills(newSkills);
        System.out.println("Теперь кот " + " " + getName() + " " + "умеет " + " " + newCommand);
    }
    @Override
    public void commands() {
        System.out.println("Кот " + " " + getName() + " " + "знает команды " + " " + getSkills());
    }
}
