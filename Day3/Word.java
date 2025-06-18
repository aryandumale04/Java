import java.util.Scanner;

public class Word {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        //taking the word input from user
        String word = sc.next();
        System.out.print(word);

        sc.close();
    }
    
}
