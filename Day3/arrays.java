import java.util.Scanner;
public class arrays {


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of  Students : ");
        int stud=sc.nextInt();
        int [] arr1 = new int[stud];
        for(int i=0;i<stud;i++){
            System.out.print("Enter the age of "+(i+1)+"th"+" student : ");
            arr1[i]=sc.nextInt();

        }
        System.out.print("Ages are : ");
        for(int i=0;i<stud;i++){
            System.out.print(arr1[i]);
            System.out.print(" ");
            

        }


    }
    
}
