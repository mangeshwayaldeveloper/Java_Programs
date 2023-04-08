package InternalPractical;

import java.io.*;

public class FileInout {
    public static void main(String[] args) {
        String inputfile="FileData/inputfile.txt";
        String outfile="C:\\Users\\mange\\Desktop\\s.txt";
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter(outfile));
            writer.write("this is line");
            writer.newLine();
            writer.write("this is the another line");
            writer.newLine();
            writer.close();
            BufferedReader bf=new BufferedReader(new FileReader(outfile));
            {
                System.out.println(bf.readLine());
                System.out.println(bf.readLine());
            }
            System.out.println(outfile);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
