import java.util.Scanner;
public class charInt {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer of your choice : ");
        int n1= sc.nextInt();

        System.out.print("Enter the character of your choice : ");
        int n2= sc.next().charAt(0);
        int result = n1+n2;
        System.out.println(result);
        



    }
    
}
