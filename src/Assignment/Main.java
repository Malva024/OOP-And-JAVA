package Assignment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
//        Assignment.Calculator c = new Assignment.Calculator();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Number 1: ");
//        float a = sc.nextFloat();
//        System.out.println("Number 1: ");
//        float b = sc.nextFloat();
//
//        c.num1 = a;
//        c.num2 = b;
//
//        System.out.println("sum is: "+c.sum());
//        System.out.println("Sub is: "+c.sub());
//        System.out.println("Multiply is :"+c.multi());
//        System.out.println("Divid is: "+c.divid());
//        System.out.println("Divid is: "+c.remainder());

        int num []={1,2,3,4,5};
        int [] num1 = new int [10];

//        Scanner sc = new Scanner(System.in);
//        for(int i=0; i<num1.length; i++)
//        {
//            System.out.println("array [" +(i+1)+ "]");
//            num1[i] = sc.nextInt();
//        }
//
//        for(int i=0; i< num1.length; i++)
//        {
//            System.out.println("Index : " +i+ "\tValue : " +num1[i]);
//        }
//        int [][] num2 = new int [3][3];
//        int sum=0;
//        Scanner sc1 = new Scanner(System.in);
//        for (int i = 0; i <= num2[i].length; i++)
//        {
//            for (int j = 0; j < num2.length; j++) {
//                System.out.print("array [" + i + "][" + j + "]: ");
//                num2[i][j] = sc1.nextInt();
//                sum += num2[i][j];
//            }
//        }
//
//
//        System.out.println("\nMatrix content:");
//        for (int i = 0; i < num2.length; i++) {
//            for (int j = 0; j < num2[i].length; j++) {
//                System.out.print(" "+num2[i][j] + "\t");
//            }
//            System.out.println();}
//        System.out.println(sum);


//        int count =0,pin=0;
//        Scanner sc = new Scanner(System.in);
//
//
//        do
//        {
//            if(count ==0)
//            {
//                System.out.println("Enter your pin");
//                pin = sc.nextInt();
//                count++;
//            }
//
//            else if(count >2)
//            {
//                System.out.println("Your card is blocked");
//                return;
//            }
//
//            else
//            {
//                System.out.println("re- enter your pin");
//                pin = sc.nextInt();
//                count++;
//            }
//        }while(pin!= 2222);
//
//        System.out.println("Welcome to the dashboard");

//


        System.out.println(" "+Math.abs(-125));
        System.out.println(" "+Math.abs(-0.55));
        System.out.println(" "+Math.pow(2,3));
        System.out.println(" "+Math.ceil(12.2));
        System.out.println(" "+Math.floor(11.9));
        System.out.println( ""+Math.sqrt(4));

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();

        System.out.println("Date: "+date+ " Time : " +time+ " Dates and time: " +dt);





}}
