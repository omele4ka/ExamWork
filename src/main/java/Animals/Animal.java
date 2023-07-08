package Animals;

public abstract class Animal {
    protected String name;
    protected String command;
    protected String type;

    public Animal(String name, String command, String type) {
        this.name = name;
        this.command = command;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public String getCommand(){
        return command;
    }

    public String getType(){
        return type;
    }
    public void executeCommand(String command){
        System.out.println("Это  " + type + name + "умеет " + command);
    }
}
