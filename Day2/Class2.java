public class Class2 {

    public class CAR{
        public String name ="Honda";

        public void Start(){
            System.out.println("Engine started successfully!");

        }
        public void Stop(){
            System.out.println("Engine stopped");
        }


    }
    public static void main(String[] args){

        Class2 c1= new Class2();
        CAR car1=c1.new CAR();
        System.out.println("Hello I am : "+car1.name);
        car1.Start();
        car1.Stop();


    }
    
}
