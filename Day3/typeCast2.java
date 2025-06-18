import java.util.Scanner;
public class typeCast2 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an double of your choice : ");
        double n1=sc.nextDouble();
        int n2= (int)n1;
        System.out.println(n2);
    }

    
}
