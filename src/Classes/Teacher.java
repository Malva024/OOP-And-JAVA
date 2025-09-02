package Classes;

import java.util.Scanner;

public class Teacher {
    public String Teacher_name;
    public int id;
    public String name;

    Courses c = new Courses();
    Marsheet mk = new Marsheet();
    Scanner sc = new Scanner(System.in);



    public void marking()
    {
        System.out.println("Course   \t Marks:");
        for (int i = 0; i < mk.c.Course_name.length; i++){
            System.out.print(mk.c.Course_name[i]+"\t");
            mk.marks[i] = sc.nextInt();}
    }

    public void Show_marks()
    {
        System.out.println("Course   \t Marks:");
        for (int i = 0; i < mk.c.Course_name.length; i++){
            System.out.println(mk.c.Course_name[i]+"\t"+ mk.marks[i]);}
    }

}
