import java.util.Scanner;

public class Array3D{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        //taking input from the user
        int numSchools = sc.nextInt();
        int numClassrooms = sc.nextInt();
        int numStudents = sc.nextInt();
        sc.nextLine();

        //creating a 3D array
        int [][][] schoolsArray = new  int[numSchools][numClassrooms][numStudents];
        
        //storing ages of students in array
        for(int i = 0;i < numSchools; i++){
            System.out.println("School : "+(i+1));
            
            for(int j = 0;j < numClassrooms;j++){

                System.out.println("Enter the age of  Students of Classroom "+ (j+1)+" Separated by spaces : ");
                String studAges = sc.nextLine();
                
                // parsing age of each student
                String [] token = studAges.split(" ");
                for(int k = 0;k < numStudents;k++){

                    schoolsArray[i][j][k] = Integer.parseInt(token[k]);
                }
            }
        } 

        //printing ages of students according to school and classroom
        for(int i = 0;i < numSchools;i++){


            System.out.println("School - "+(i+1));
            for(int j = 0;j < numClassrooms;j++){
                System.out.print("The ages of students of class - "+(j+1)+" are : ");

                for(int k = 0;k < numStudents;k++){
                    System.out.print(schoolsArray[i][j][k]+ " ");
                   
                }
                 System.out.println();
                 sc.close();
            }
        }

    }

}