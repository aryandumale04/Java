import java.util.Scanner;

public class Array2D1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //taking number of employes and their working days as input
        System.out.print("Enter the number of employees : ");
        int empCount = sc.nextInt();

        System.out.print("Enter the number of working days for each employee : ");
        int workDays = sc.nextInt();

        //creating a 2d 
        int[][] empArray = new int[empCount][workDays];


        //taking working hours of each employee as input
        for(int i = 0;i < empCount;i++){
            System.out.println("Enter the Working hours (day wise) of "+(i+1)+ " employee : ");
            for(int j = 0; j < workDays;j++){
                System.out.print("Day - "+(j+1)+" : ");
                empArray[i][j] = sc.nextInt();
            }
        }

        // printing the empArray
        for(int i = 0;i < empCount;i++){

            System.out.print("Working Days for employee - "+(i+1)+" : ");
            for(int j = 0;j < workDays;j++){
                System.out.print(empArray[i][j] + " ");

            }
            System.out.println();

        }
    }

    
}
