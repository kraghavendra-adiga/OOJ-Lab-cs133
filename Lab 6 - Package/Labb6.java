package CIE;

import java.util.Scanner;

public class InternalsSix extends Studentsix{
    Scanner sc= new Scanner(System.in);
    int [] imarks = new int[5];
    public InternalsSix(String usn, String name, int sem){
        super(usn,name,sem);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the Internal marks of " + (i+1) +" subject:");
            imarks[i]=sc.nextInt();
        }
    }

    public void show(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Internal Marks of " + (i+1) +" subject is: " + imarks[i]);
        }
    }

}
