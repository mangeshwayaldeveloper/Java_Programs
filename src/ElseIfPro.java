import java.util.ArrayList;

public class ElseIfPro {
    public static void main(String[] args) {
        ArrayList<Integer> lang=new ArrayList<>();
        lang.add(23);
        lang.add(30);
        lang.add(45);
        if (lang.contains(24)){
            System.out.println("The element "+23+" is Present");
        }else if (lang.contains(30)){
            System.out.println("The element "+30+" is present");
        } else if (lang.contains(45)) {
            System.out.println("Present in list");
        }

    }
}
