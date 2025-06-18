import java.util.Scanner;
public class typeCast3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an float : ");
        float a = sc.nextFloat();
        int b= (int)a;
        byte c = (byte) b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        

    }
    
}
