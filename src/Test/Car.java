package Test;

public class Car {
    private String Name;
    private String Model;
    private int year;

    public Car(String name, String model, int year) {
        setName(name);
       setModel(model);
        setYear(year);
    }

    public String getName() {return Name;}

    public void setName(String name) {if(!name.isEmpty() && !name.trim().isEmpty()){this.Name = name;} else {System.out.println("invalid");}}

    public String getModel() {return Model;}

    public void setModel(String model) { if(!model.isEmpty() && !model.trim().isEmpty()){ this.Model = model;}else {System.out.println("invalid");}}

    public int getYear() {return year;}

    public void setYear(int year) {if(year>0){this.year = year;}else {System.out.println("invalid");}}
}
