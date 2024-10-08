import java.util.Scanner;


class Student {
    private String usn;
    private String name;
    private int[] credits;
    private int[] marks;
    private int numSubjects;

    public Student(int numSubjects) {
        this.numSubjects = numSubjects;
        credits = new int[numSubjects];
        marks = new int[numSubjects];
    }

    public void getStudentDetails(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name: ");
        name=sc.nextLine();

        System.out.println("Enter the USN: ");
        usn=sc.nextLine();

        for (int i = 0; i < numSubjects; i++) {

            System.out.println("Enter the credits for subject " + (i+1) + " here: ");
            credits[i]=sc.nextInt();

            System.out.println("Enter the marks for subject " + (i+1) + " here: ");
            marks[i]=sc.nextInt();


        }

    }//getstudentdetails method

    public void getmarks(){
        System.out.println("Name of the student: " + name);
        System.out.println("USN of the student: " + usn);
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("marks of subject " + (i+1) + " is:" + marks[i]);

        }

    }

    public double computesgpa(){
        int grade;
        double total=0;
        int totalcred=0;
        for (int i = 0; i < numSubjects; i++) {
            grade= marks[i]/10;
            if(grade>10) grade=10;

            if(grade<4) grade=0;

            double temp= grade*credits[i];
            total+=temp;
            totalcred+=credits[i];


        }

        return total/totalcred;
    }


}

public class intellijStudent {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the total number of students here: ");
        int totalstudents= st.nextInt();
        Student [] arrayofObj = new Student[totalstudents];

        for (int i = 0; i < totalstudents; i++) {

            arrayofObj[i] = new Student(2);
            arrayofObj[i].getStudentDetails();
            arrayofObj[i].getmarks();
            double sgpaofs1=arrayofObj[i].computesgpa();
            System.out.println("SGPA of the student is: " + sgpaofs1);

        }

    }
}
