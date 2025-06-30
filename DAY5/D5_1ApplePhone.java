public class D5_1ApplePhone {
    String model="IPHONE 15";
    double cost=69000;
    String color=" RED";
    public  void  makeCall(){
        System.out.println(model+" Make CaLL");
    }
       public  void  SendTextMsg(){
        System.out.println(model+" Able to send TextMsg and the "+"Color of the phone is"+color);
    }
    public  void  SendVideo(){
        System.out.println(model+" Able to send Video"+ color +"cost of rs");
    }
    public static void main(String[] args) {
         D5_1ApplePhone b=new D5_1ApplePhone();
         b.makeCall();
         b.SendTextMsg();
         b.SendVideo();
    }
      
}
