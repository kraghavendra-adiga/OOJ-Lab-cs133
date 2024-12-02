package SEE;

import CIE.*;

import java.util.Scanner;

public class ExternalsSix extends Studentsix {
    Scanner sc = new Scanner(System.in);
    int [] emarks = new int[5];
    public ExternalsSix(String usn, String name, int sem){
        super(usn,name,sem);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the External marks of " +" subject:" + (i+1));
            emarks[i]=sc.nextInt();
        }
    }

    public void show(){
        for (int i = 0; i < 5; i++) {
            System.out.println("External Marks of subject" + (i+1) + ":" +emarks[i]);
            }
    }


}