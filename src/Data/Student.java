package Data;

public class Student implements iStudent, Person {

    private String Name;
    private String Sirname;
    private String School;
    private char Grades;

    @Override
    public String getName() {return Name;}

    @Override
    public void setName(String Name) {this.Name = Name;}

    @Override
    public String getSirname() {return Sirname;}

    @Override
    public void setSirname(String Sirname) {this.Sirname = Sirname;}

    @Override
    public String getSchool() {return School;}

    @Override
    public void setSchool(String School) {this.School =School;}

    @Override
    public char getGrades() {return Grades;}

    @Override
    public void setGrades(char Grades) {this.Grades=Grades;}

}
