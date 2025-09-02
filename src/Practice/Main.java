package Practice;

public class Main {
    public static void main(String[] args) {
/*        Circle c1 = new Circle();
        System.out.println("Radius:  " +c1.getRadius()+ " Color:" +c1.getColor()+ "  The area is: " +c1.getArea());

        Circle c2 =  new Circle(2.0,"Blue");
        System.out.println("Radius:  " +c2.getRadius()+ " Color:" +c2.getColor()+ "  The area is: " +c2.getArea());

        Circle c3 = new Circle();
        c3.setRadius(11);
        c3.setColor("Pink");
        System.out.println("Radius: " +c3.getRadius()+ " Color:" +c3.getColor()+ "  The area is: " +c3.getArea());

        Circle c4 = new Circle(5.5 , "Yellow");
        System.out.println(c4.toString());

        Circle c5 = new Circle(6, "Neon");
        System.out.println(c5.toString());
        System.out.println(c5);
        System.out.println(". " + c5);

        System.out.println("\nSECOND CIRCLE");

        Circle2 cr1 = new Circle2();
        System.out.println(cr1);
        System.out.println(cr1.toString());

        Circle2 cr2 = new Circle2(2);
        System.out.println(cr2);
        System.out.println("Area: " +cr2.getArea()+ "  Circumference: "+cr2.getCircumference());

        Circle2 cr3 = new Circle2();
        cr3.setRadius(12);
        System.out.println("Radius: "+cr3.getRadius()+"  Area: " +cr3.getArea()+ "  Circumference: "+cr3.getCircumference());

        System.out.println("\nRECTANGLE");

        Rectangle r = new Rectangle();
        System.out.println(r);
        System.out.println("Area: " +r.getArea()+ "  Perimeter: " +r.getPerimeter());

        Rectangle r2 = new Rectangle(5,5);
        System.out.println(r2);
        System.out.println("Area: " +r2.getArea()+ "  Perimeter: " +r2.getPerimeter());

        Rectangle r3 = new Rectangle();
        r3.setlength(10);
        r3.setwidth(14);
        System.out.println(r3);
        System.out.println("Area: " +r3.getArea()+ "  Perimeter: " +r3.getPerimeter());

        System.out.println("\nEmployee");
        Employee e = new Employee(14,"Nemo","Memo",100);
        System.out.println(e.toString());
        System.out.println("Raise in Salary: "+e.raiseSalary(10)+ " Annual Salary: " +e.getAnnualSalary());
        e.setSalary(e.raiseSalary(20));
        System.out.println(e.toString());

        System.out.println("\nInvoice Team");
        InvoiceItem i = new InvoiceItem("A101", "Yello Pencil", 10 ,8);
        System.out.println(i);
        System.out.println("Total Cost: "+i.getTotal());
        i.setQty(30);
        i.setUnit_Price(10);
        System.out.println(i);
        System.out.println("Total Cost: "+i.getTotal());

        System.out.println("\nAccount");
        Account a1 = new Account("A001", "Nemo",88);
        System.out.println(a1);
        Account a2 = new Account("B101","memo");
        System.out.println("Id: "+a1.getId());
        System.out.println("Name: "+a1.getName());
        System.out.println("Balance: "+a1.getBalance());

        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);

        a1.transfer(a2.getBalance(), 50);
        System.out.println(a1);
        System.out.println(a2);

        System.out.println("CHICKEN");
        Chicken chick1 = new Chicken("Nemo", 11);
        System.out.println("Eggs per Day: " +chick1.eggsPerday());
        chick1.produtionPerday();*/


//        System.out.println("Pizza");
//        pizza p1 = new pizza("cheez",775);
//
//
//        pizza.Dough d1 = new pizza.Dough("yellow", "burnt",500);
//
//
//        pizza.Topping t1 = new pizza.Topping("Mushroom", 50);

        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("X: "+p1.getX());
        System.out.println("Y: "+p1.getY());
        p1.setXY(3,0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint();
        System.out.println(p2);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5,6));
        System.out.println(p1.distance());

        MyPoint [] points = new MyPoint[10];

        for(int i=0; i< points.length; i++)
        {
            points[i] = new MyPoint(i,i);
        }

















    }
}
