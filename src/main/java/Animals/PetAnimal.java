package Animals;

public abstract class PetAnimal extends Animal{

    protected String breed;
    protected PetAnimal(String name, String command, String type, String breed) {
        super(name, command, "Домашнее животное");
        this.breed = breed;
    }
    @Override
    public void executeCommand(String command) {
        System.out.println("Это  " + type + breed + name + "знает команду " + command);
    }
}
