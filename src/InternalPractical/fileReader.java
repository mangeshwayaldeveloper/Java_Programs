package InternalPractical;

import java.io.BufferedReader;
import java.io.FileReader;

public class fileReader {
    public static void main(String[] args) {

        String fname = "C:\\Users\\mange\\Desktop\\s.txt";
        int numChars = 0;
        int numWords = 0;
        int numLines=0;
        try{
            BufferedReader bf=new BufferedReader(new FileReader(fname));
            String line;
            while ((line= bf.readLine())!=null){
                System.out.println(line);
                numChars+=line.length();
                numWords+=line.split("\\s+").length;
                numLines++;
            }
            System.out.println(numLines);
            System.out.println(numChars);
            System.out.println(numWords);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
