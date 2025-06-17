public class Class {

    public static class Dog{
        
           public String name = "Doggesh";
           public void Bark(){
                System.out.println("Bow Bow!");
            }

    }
    public static void main(String[] args){
        Dog d1=new Dog();
        d1.Bark();
        System.out.println("My name is : "+d1.name);
    }
}

