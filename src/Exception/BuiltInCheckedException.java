package Exception;
// checked exception as it is checked at compile time

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuiltInCheckedException {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\mange\\Desktop\\interview.txt");
        BufferedReader fileInput = new BufferedReader(fileReader);
        for (int ct = 0; ct < 3; ct++)
            System.out.println(fileInput.readLine());
        fileInput.close();
    }
}