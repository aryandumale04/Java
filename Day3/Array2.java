import java.util.Scanner;

public class Array2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Phone numbers you want to enter : ");
        int numCount = sc.nextInt();
        sc.nextLine();
        long[] numArray = new long[numCount];
        System.out.print("Enter the phone numbers separated by spaces : ");
        String numbers = sc.nextLine();
        String[] numbersStrings = numbers.split(" ");
        for(int i = 0; i < numCount; i++ ){
            numArray[i] = Long.parseLong(numbersStrings[i]);
        }
        System.out.print("The entered numbers are : ");
        for(int i = 0; i < numCount; i++ ){
            System.out.print(numArray[i]+ " ");
        }

    }
}
