package Lab;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

class AgeException extends java.lang.Exception{
    public AgeException(String str){
        super(str);
    }
}


class Father{
    Scanner sc = new Scanner(System.in);
int fatherAge;

public Father(){
    try {
        System.out.println("Enter the age of Father here: ");
        fatherAge = sc.nextInt();
        if (fatherAge < 0) throw new AgeException("Father Age Can't be negative: ");
    }
        catch(AgeException e){
            System.out.println(e);
            System.out.println("Re-Enter Father's age here: ");
            fatherAge = sc.nextInt();
        }
    }

    public void fatherDetails(){
        System.out.println("Father's age is: " + fatherAge);
    }
}


class Son extends Father{
    Scanner sc = new Scanner(System.in);
    int sonAge;
    public Son() {
        super();
        try{
        System.out.println("Enter son age: ");
        sonAge = sc.nextInt();
        if(sonAge>fatherAge) throw new AgeException("Son age can't be greater than Father's age");
        }

        catch (AgeException e){
            System.out.println(e);
            System.out.println("Re-Enter Son's age: ");
            sonAge = sc.nextInt();
        }
    }

    public void sonDetails(){
        System.out.println("Son's age is: " + sonAge);
    }
}



public class Exception {
    public static void main(String[] args) {
        Son sonObj = new Son();

        sonObj.sonDetails();
        sonObj.fatherDetails();
        System.out.println();
        System.out.println("Name: Raghavendra Adiga");
        System.out.println("USN: 1BM23CS133");
    }
}