package Animals;

public class PetAnimal extends Animal{
    public PetAnimal(String name, String command) {
        super(name, command);
    }

    @Override
    public String getType() {
        return "Домашнее животное ";
    }
}
