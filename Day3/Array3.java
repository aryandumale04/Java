import java.util.Scanner;

public class Array3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //taking the length of array
        System.out.print("Enter the number of names you want to insert : ");
        int nameCount = sc.nextInt();

        //creating array and taking input
        String[] studNames = new String[nameCount];
        System.out.println("Enter the names of student below : ");
        for(int i = 0; i < nameCount; i++){
            studNames[i] = sc.next();
        }

        //displaying the array
        for(int i = 0; i < nameCount; i++){
            System.out.print("The name of Student at index "+i+" is :  "+studNames[i]+"\n");
            
        }

    }

    
}
