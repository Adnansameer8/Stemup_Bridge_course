public class p1_4 {
    static double celsiusToFahrenheit(double c){
       //F = (°C × 1.8) + 32
       double Fahrenheit=(c*1.8)+32;
       return Fahrenheit;
    }
    static double fahrenheitToCelsius(double F){
        //C = (°F - 32) / 1.8
        double Celsius=(F - 32) / 1.8;
        return Celsius;

    }
    public static void main(String[]args){
        double a=celsiusToFahrenheit(45);
        double b=fahrenheitToCelsius(113.0);
        System.out.println("The Fahrenheit is "+a);
         System.out.println("The Celsius is "+b);
    }
}
