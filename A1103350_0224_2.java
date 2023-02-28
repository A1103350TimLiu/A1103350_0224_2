import java.util.*;

public class A1103350_0224_2 {
    public static void main(String[] argv) {
        int c, f;
        System.out.println("please enter degrees Celsius");
        Scanner degree = new Scanner(System.in);
        c = degree.nextInt();
        f = c * 9/5 + 32;
        System.out.println(c+" degrees Celsius = "+f+" degrees Fahrenheit");
    }
}