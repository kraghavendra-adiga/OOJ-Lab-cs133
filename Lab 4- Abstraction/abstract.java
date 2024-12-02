package CS133programs;

import java.util.Scanner;

abstract class Shape{
    int length,height,radius;

    abstract void printArea();
}

class Rectangle extends Shape{
    Scanner sc=new Scanner(System.in);
    public void accept(){
        System.out.println("Enter the length of the Rectangle: ");
        length=sc.nextInt();
        System.out.println("Enter the width of the Rectangle: ");
        height=sc.nextInt();
    }
    void printArea(){
        System.out.println("Area of the rectangle is: " + length*height);
    }
}

class Triangle extends Shape{
    Scanner sc=new Scanner(System.in);
    public void accept(){
        System.out.println("Enter the Base of the Triangle: ");
        length=sc.nextInt();
        System.out.println("Enter the Height of the Triangle: ");
        height=sc.nextInt();
    }
    void printArea(){
        float temp= (float) (length*height)/2;
        System.out.println("Area of the Triangle is: " + temp);
    }
}

class Circle extends Shape{
    Scanner sc=new Scanner(System.in);
    public void accept(){
        System.out.println("Enter the Radius of the Circle: ");
        radius=sc.nextInt();
    }
    void printArea(){
        float temp= (float) (radius*radius*3.1428);
        System.out.println("Area of the Triangle is: " + temp);
    }
}


public class shapeclass {
    public static void main(String[] args) {
        Rectangle obj1= new Rectangle();
        Triangle obj2= new Triangle();
        Circle obj3= new Circle();
        System.out.println("Shape: Rectangle: ");
        System.out.println();
        obj1.accept();
        obj1.printArea();

        System.out.println("Shape: Triangle: ");
        System.out.println();
        obj2.accept();
        obj2.printArea();

        System.out.println("Shape: Circle: ");
        System.out.println();
        obj3.accept();
        obj3.printArea();
        
    }

}
