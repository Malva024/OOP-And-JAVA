package Abstraction.Animal;

public class BigDog extends Dog{


    public BigDog(String Name) {
        super(Name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("WoooooW");
    }

    public void greets(BigDog another) {
        System.out.println("WooooooooooW");
    }

}
