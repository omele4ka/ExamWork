package Animals;

public abstract class PackAnimal extends Animal{

    protected String breed;

    protected PackAnimal(String name, String command, String type, String breed) {
        super(name, command, "Вьючное животное");
        this.breed = breed;
    }


    public String getBreed(){
        return breed;
    }

    @Override
    public void executeCommand(String command) {
        System.out.println("Это  " + type + breed + name + "знает команду  " + command);
    }
}
