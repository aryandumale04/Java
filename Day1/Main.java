package Day1;

//Introduction
// Java IO
// Variables
// Datatypes
// Control statements
// Arrays
// Strings
// StringBuilder

public class Main{
    public static void  main(String[] args){
        
        StringBuilder sb = new StringBuilder("Abra Ka Dabra");
        sb.append(" Gilli Gilli Chu");
        System.out.println(sb);

        sb.insert(0, "This ");
        System.out.println(sb);

        sb.replace(0,10," UDDI baba mai toh gayi");
        System.out.println(sb);

         sb.delete(0,10);
        System.out.println(sb);
           

        sb.reverse();
        System.out.println(sb);
        System.out.println("The capacity is : "+sb.capacity());
        System.out.println("The length is : "+sb.length());
        sb.setCharAt(0,'y');
        System.out.println(sb);
        System.out.println(sb.toString());
    }
}