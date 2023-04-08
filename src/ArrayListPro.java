import java.util.ArrayList;
import java.util.List;

public class ArrayListPro {
    public static void main(String[] args) {
      List<String> arr1=new ArrayList<String>();
     arr1.add("one");
     arr1.add("Two");
     arr1.add("Three");
     List <String> arr2=new ArrayList<String>();
     arr2.add("one");
     arr2.add("Two");
     arr2.add("Three");
        System.out.println(arr1);
        System.out.println(arr2);
        if (arr1.equals(arr2)){
            System.out.println("Equal");
        }else{
            System.out.println("not equal");
        }
        arr2.add("Four");
        System.out.println(arr1+"\n"+arr2);
        boolean com= arr1.equals(arr2);
        if (com){
            System.out.println("list are equal");
        }else {
            System.out.println("not Equal");
        }
    }
}
