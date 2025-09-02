package Assignment;

import java.util.Scanner;

public class mmain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car car1 = new Car("Mclaren","750S", 2022,200000);
        car1.Start();

//        Assignment.Student std= new Assignment.Student();
//
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        std.name = sc.next();
//        System.out.println("Enter Roll.no: : ");
//        std.roll_no  = sc.nextInt();
//        System.out.println("Enter Courses: ");
//        std.course = sc.next();
//        std.study();

        teacher teach = new teacher();
        teach.name = "memo";
        teach.subject = "opps";
        teach.salary = 100;

        teach.teach();

        Book b1 = new Book();
        b1.title = "Percy Jackson";
        b1.author = "Jermy";
        b1.price = 100;
        b1.display();

        BankAccount bk = new BankAccount();

        bk.setAccount_holder_Name("Hamna");
        bk.setBalance(100);
        System.out.println("Account Holder name:"+bk.getAccount_holder_Name());
        System.out.println("Balance" +bk.getBalance());
        bk.depositAmount(20);
        System.out.println("Balance" +bk.getBalance());
        bk.withdrawAmount(50);
        System.out.println("Balance" +bk.getBalance());

        Library l = new Library();
        l.setName("memo");
        l.setPasswords("TRS111239");
        l.setDob(24-10-05);
        l.verification("TRS111239");
        System.out.println("\n");

        EmployeeRecords e = new EmployeeRecords("Ni HaU", -19 , -1234567);
        e.setName("Nemo");
        System.out.println("Name: "+e.getName()+" Age: "+e.getAge()+ " Salary: " +e.getSalary());





















    }
}
