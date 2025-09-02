package Encap;

public class Author {
    private String Name;
    private String Nationality;

    public Author(String name, String nationality) {setName(name);setNationality(nationality);}

    public String getName() {return Name;}

    public void setName(String name) {
        Name = name;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }
}
