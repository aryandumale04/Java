import java.util.Scanner;
public class Bank {

    public static class SBI{
        int balance=77;
        Scanner sc1=new Scanner(System.in);
        

        void OPeration(int choice){
            switch(choice){
                case 1://withdraw function
                    System.out.println("Enter the amount you want to withdraw : " );
                    double amt=sc1.nextDouble();
                    if(amt>balance){
                        System.out.println("Insufficient Balance cannot withdraw Money!!");
                        break;
                    }
                    else{
                        
                        balance-=amt;
                        System.out.println("Money withdrawn successfully,Current Balance : "+balance);
                        break;
                    }
                case 2:
                //check balance function
                    System.out.println("Current Balance : "+balance);
                    break;
                case 3:
                    System.out.println("Enter the amount to be deposited in the account in Rupees : ");
                    double ampt=sc1.nextDouble();
                    balance+=ampt;
                    System.out.println("Money deposited successfully,CUrrent balanace : "+balance);
                default:
                    System.out.println("Invalid choice !! ");
                
                    
            }
        }
    }
    public static void main(String[] Args){
        SBI s1= new SBI();
        Scanner sc2=new Scanner(System.in);
        
        while(true){
            

            
            System.out.println("What would youb like to do ? \n 1.Withdraw Money \n 2. Check Balance \n 3.Deposit Money\n 4.Exit");
            int choice = sc2.nextInt();
            if(choice==4){
                System.out.println("Thank you for using our services !");
                break;
            }else{
                s1.OPeration(choice);

            }
            




        }
    }
    
}
