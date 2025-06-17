import java.util.Scanner;

public class Area {
    public static class CalulateArea{

        double area(double r){

            double areaofCircle = 3.14*r*r;
            return areaofCircle;

        }
        double circumFerence(double r){
            double circum=2*3.14*r;
            return circum;
        }

    }
    public static void main (String[] Args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double r=sc.nextDouble();

        CalulateArea a1= new CalulateArea();
        double resArea=a1.area(r);
        System.out.println("The area of circle with radius "+r+" is : "+resArea);
        
        double resCircum=a1.circumFerence(r);
        System.out.println("The circumference of circle with radius "+r+" is : "+resCircum);






    }
    
}
