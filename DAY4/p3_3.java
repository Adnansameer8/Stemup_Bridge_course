
public class p3_3 {

    
    public static void C(int value) {
        System.out.println("Final Result is : " + value);
    }

    public static int B() {
        int result = 10 + 5; 
        return result;
    }


    public static void A() {
        int bResult = B();   
        C(bResult);          
    }

    public static void main(String[] args) {
        A();  
    }
}


