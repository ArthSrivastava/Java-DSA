package Practice;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        BufferedWriter writer = new BufferedWriter(fw);
        writer.write("Hey my name is Arth");
        writer.write("\nABCDEFGHIJKLMNOPQRSTUVWXYZ");
        writer.close();
        FileReader fr = new FileReader("output.txt");
        BufferedReader reader = new BufferedReader(fr);
//        System.out.println(reader.readLine());
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
