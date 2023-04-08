package Assignment;

class CustomString{
    String str;
    CustomString(String str){
        this.str =str;
    }
    void reverse(){
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev+=str.charAt(i);
        }
        str = rev;
        System.out.println("Reversed String: "+str);
    }
    boolean equals(CustomString secondString){
        for (int i = 0; i < str.length(); i++) {
            if(secondString.str.charAt(i)!=str.charAt(i)){
                return false;
            }
        }
        return true;
    }
    void toUpper(){
        char[] ch = str.toCharArray();
        str="";
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) (ch[i] - 32);
            str+=ch[i];
        }
        System.out.println("In Uppercase: "+str);
    }
    void toLower(){
        char[] ch = str.toCharArray();
        str="";
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) (ch[i] + 32);
            str+=ch[i];
        }
        System.out.println("In Lowercase: "+str);
    }
}
public class StringClass {
    public static void main(String[] args) {
        CustomString str = new CustomString("Mangesh");
        CustomString st = new CustomString("Mangesh");
        System.out.println(str.equals(st));
        str.reverse();
        str.toUpper();
        str.toLower();
    }
}
