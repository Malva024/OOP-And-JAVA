package Abstraction.Animal;

public class Cat extends Animal{

    public Cat(String Name) {super.setName(Name);}

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
