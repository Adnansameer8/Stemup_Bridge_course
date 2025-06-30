public class D5_2Escalator {
    double cost=69000;
    String type1="Belt-type escalators";
    String type2="Stairway escalators";
    public  void  CarryPeoplesGoods(){
        System.out.println(type1+"Can Carry peoples, goods and the Cost is "+cost);
    }
       public  void CarryPeoples(){
        System.out.println(type2+"Can Carry only peoples not goods and the Cost is "+cost);
    }
    public  void  MoveingDirection(){
        System.out.println(type1+" AND "+type2+" Able to Move front and back");
    }
    public static void main(String[] args) {
          D5_2Escalator b=new D5_2Escalator();
         b.CarryPeoplesGoods();
         b.CarryPeoples();
         b.MoveingDirection();
    }
      
}
