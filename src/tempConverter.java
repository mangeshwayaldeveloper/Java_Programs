import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class tempConverter {
    public int a=10;
    void meth(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tempConverter t = new tempConverter();
        System.out.println(t.a);
        System.out.println("Enter Temp In Celsius");
        float tf = sc.nextFloat();
        float tempf = (tf * 9 / 5) + 32;
        System.out.println("Temperature in farenhite " + tempf);

    }
}
class adesh{
    void methd(){
//        System.out.println(a);
    }
}