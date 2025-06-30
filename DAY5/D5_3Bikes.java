public class D5_3Bikes {
    double cost=100000;
    String type="Petrol";
    String Color="Black";
    public  void  Speed(){
        System.out.println(type+" engine Speed is  some speed");
    }
       public  void millage(){
        System.out.println(type+" engine "+" millage is ------");
    }
    public  void  Looks(){
        System.out.println(" The cost of bike is "+cost+" and the color is "+Color);
    }
    public static void main(String[] args) {
          D5_3Bikes b=new D5_3Bikes();
         b.Speed();
         b.millage();
         b.Looks();
    }
}
