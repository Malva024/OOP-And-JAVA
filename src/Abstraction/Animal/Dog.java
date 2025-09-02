package Abstraction.Animal;

public class Dog extends Animal{

    public Dog(String Name) {super.setName(Name);}

    @Override
    public void greets() {
        System.out.println("Woof");}


    public void greets(Dog another) {
        System.out.println("Woof");
    }

}
