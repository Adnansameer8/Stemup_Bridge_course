public class Car{
    String model_name;
    int cost;
    String type;
    String color;

    Car(String a, int b, String c, String d){
        model_name=a;
        cost=b;
        type=c;
        color=d;

    }
    public void start(){
        System.out.println(model_name+" starts with Some sound");
    }
    public void Speed(){
        System.out.println("My car runs on "+type);
    }
    public void Outlook(){
        System.out.println("My car has "+color+ " color");
    }
     void Price(){
        System.out.println("My car "+model_name+"costs "+cost);
    }
    public static void main(String[] args) {
        Car c1= new Car("XUV",30000000,"petrol","Red");
        c1.start();
        c1.Speed();
        c1.Outlook();
        c1.Price();
        }
}