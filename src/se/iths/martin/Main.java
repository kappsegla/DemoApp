package se.iths.martin;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public void printInfo(String s, int size, boolean bold){


    }
    public void printInfo(String s, int size){
        printInfo(s,size,false);
    }

    public void printInfo(String s){
        printInfo(s,12);
    }



    /*
    Many
    lines
     */
    public static void main(String[] args) {

        Random r = new Random();

//        nextInt( (maxvalue+1) - minvalue) + minvalue;

        int random = 10 + r.nextInt(11);

        int percent = r.nextInt(100);
        if( percent < 60 )
        {

        }
        if( r.nextDouble() < 0.6)
        {

        }

        String s = "Hej ";
        String t = "då!";



















//        Main m = new Main();
//        m.printInfo("För utskrift",12,false);
//        m.printInfo("Normal utskrift");

        Point p1 = new Point(1.0, 1.0);

        Point p2 = new Point(4.0, 5.0);

        System.out.println(p2);

        System.out.println( p1.distanceTo(p2) );
        System.out.println( p1.distanceTo(p1) );

        Point p3 = new Point(p1);
        Point p4 = p1;

        int[] array = new int[5];
        int[] array2 = array.clone();

        Point[] points = new Point[2];

        points[0] = new Point(1.0, 1.0);
        points[1] = new Point(p3);

        Point[] points2 = points.clone();













//        ArrayList<Rectangle> rectangleArrayList = new ArrayList<Rectangle>();
//
//        rectangleArrayList.add( new Rectangle() );
//
//        //Lagring av primitiva typer ej möjligt i ArrayList
//        //Använd motsvarande klass och autoboxing.
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//
//        arrayList.add( 2 );








//        Adress adress = new Adress("Snorgatan","Kalmar",77);
//        Employee employee = new Employee("Martin",40, adress);
//        Employee employee1 = new Employee("Anna",32, new Adress("Storgatan","Göteborg",1));
//
//        System.out.println(employee.getName() + " från " + employee.getAdress().getCity());
//
//        System.out.println(employee1.getName() + " från " + employee1.getAdress().getCity());
//
//        employee1.setAdress( employee.getAdress() );
//        System.out.println(employee1.getName() + " från " + employee1.getAdress().getCity());
//
//
//        Rectangle rectangle = new Rectangle();
//        Rectangle rectangle1 = new Rectangle();
//
//        rectangle.setHeight(100);
//        rectangle.setWidth(10);



        //
//        System.out.println( rectangle.getWidth() );
//        System.out.println( rectangle.getHeight() );
//        System.out.println(rectangle.isSquare());
//
//        System.out.println(rectangle1.getWidth());


//
//
//        // write your code here
//        Scanner sc = new Scanner(System.in);
/*
        //Jämförelse av textsträngar
        String nextLine = sc.nextLine();

        if (nextLine.equals("Hej") ) {
            System.out.println("Samma text");
        }
        else
        {
            System.out.println("Ej samma");
        }
*/
//        for (int b = 40; b >= 30; b--) {
//            System.out.println(b);
//        }
//
//        int value = 2;
//        while( value < 13 ) {
//            System.out.println(value);
//            value += 2;
//        }


    /*    //Rounding to nearest integer
        float value = sc.nextFloat();

        int nextLine = (int)(value + 0.5f);
*/
/*      System.out.println("Hello World!");
        System.out.println("Hello World!");
        int age = 5;

        System.out.println(age);

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(text);

        float tal = sc.nextFloat();
        System.out.println(tal);
*/

    }
}
