package InternalPractical;

import java.util.Random;

public abstract class PartialImplementation implements partialInt{
    int salary=50000;
    @Override
    public void name() {
        System.out.println("Name of the Employee is");
    }
    @Override
    public void salary() {
        System.out.println(salary+bonus);
    }
}
class ex{
    public static void main(String[] args) {
        PartialImplementation ps=new PartialImplementation() {

            Random n=new Random();
            int a=n.nextInt(1000);
            @Override
            public void id() {
                System.out.println("This is the id "+a);
            }
        };
        ps.salary();
        ps.name();
        ps.id();
    }
}
