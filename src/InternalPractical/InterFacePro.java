package InternalPractical;

interface Emplyee{
    public void name();
        }
public class InterFacePro implements Emplyee{
public void name(){
    System.out.println("Emplyee Name is Ashis");
}

    public static void main(String[] args) {
        InterFacePro t=new InterFacePro();
        t.name();
    }
}
