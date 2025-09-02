package Abstraction.Animal;

public abstract class Animal {
    private String Name;

    public String getName() {return Name;}

    public void setName(String Name) {if(!Name.isEmpty() && !Name.trim().isEmpty()){this.Name = Name;}}

    public void greets(){}
}
