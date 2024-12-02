import CIE.InternalsSix;
import SEE.ExternalsSix;

import java.util.Scanner;

public class LabSix {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n;
        System.out.println("Enter the total no.of Students here: ");
        n=sc.nextInt();

        InternalsSix [] arr1 = new InternalsSix[n];
        ExternalsSix [] arr2= new ExternalsSix[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the USN of the student " + (i+1) + ":");
            String usn= sc.next();

            System.out.println("Enter the name of the student " + (i+1) + ":");
            String name = sc.next();

            System.out.println("Enter the sem of the student " + (i+1) + ":");
            int sem =sc.nextInt();

            arr1[i] = new InternalsSix(usn,name,sem);
            arr2[i] = new ExternalsSix(usn,name,sem);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Marks of Student" +(i+1) +":");
            arr1[i].show();
            System.out.println();
            arr2[i].show();
            System.out.println();
        }
    }
}
