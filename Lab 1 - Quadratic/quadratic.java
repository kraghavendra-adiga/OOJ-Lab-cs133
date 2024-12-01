import java.util.Scanner;

class ComputeQuadratic{
    public static void compute(double delta, double a, double b, double c) {
        if (delta < 0)
            System.out.println("Given quadratic equation has no real roots. ");

        else if(delta==0){

            double root1 = -b / (2*a);
            System.out.println("Roots of the quadratic equation are real and equal");
            System.out.println("Roots are: root1=root2= " + root1);

        } else {

            double root1 = (-b + Math.sqrt(delta))/(2*a);
            double root2 = (-b - Math.sqrt(delta))/(2*a);

            System.out.println("Roots of the quadratic equation are real and distinct ");
            System.out.println("Root1= "+root1 + "\nRoot2=" + root2);

        }


    }
}

public class quadratic133 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a,b and c of the quadratic equation here please: ");

        double a =sc.nextDouble();
        double b= sc.nextDouble();
        double c = sc.nextDouble();


        double delta = (b*b) - (4*a*c);

        if(a==0){
            System.out.println("The given equation is not a QUADRATIC EQUATION: ");
                    }
        else{
            ComputeQuadratic.compute(delta,a,b,c);
        }

        System.out.println("Name: K Raghavendra S Adiga");
        System.out.println("USN: 1BM23CS133");
    }
}