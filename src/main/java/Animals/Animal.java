package Animals;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    protected String name;
    protected String skills;
    protected String type;

    public Animal(String name, String skills, String type) {
        this.name = name;
        this.skills = skills;
        this.type = type;
    }

    public String getName(){

        return name;
    }

    public String getSkills(){
        return skills;
    }
    public void setSkills(String newSkill){

        this.skills = newSkill;
    }
    public abstract void commands();
    public abstract void teachNewCommand(String newCommand);

    public String getType(){
        return type;
    }

}
