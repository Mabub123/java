package homework;

public class HW051120232 {
    public static void main(String[] arge) {
        double euro = 100;
        double b = 0.92;
        System.out.println(convert(euro,b));
    }
public static double convert(double euro, double b) {
        double result = euro * b;
        return result;
    }
}
