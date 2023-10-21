package Practice.file;

import java.io.*;

public class IOStreamExample {
    public static void main(String[] args) {
        fileFunctions();
    }

    private static void fileFunctions() {
//        try {
//            File fo = new File("new-file.txt");
//            System.out.println(fo.createNewFile());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //write to file
//        try {
//            FileWriter fileWriter = new FileWriter("new-file.txt");
//            String s = "This is a new string!";
//            fileWriter.write(s.toCharArray());
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //Read from a file
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("new-file.txt"));
//            while (br.ready()) {
//                System.out.println(br.readLine());
//            }
//            br.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //Delete a file
        try {
            File fo = new File("note.txt");
            if (fo.delete()) {
                System.out.println(fo.getName());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void readingInputs() {
        //Reading from InputStream
//        try (InputStreamReader isr = new InputStreamReader(System.in)) {
//            int c = isr.read();
//            while(isr.ready()) {
//                System.out.println("Char: " + (char)c);
//                c = isr.read();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //Reading from file
//        try(FileReader fr = new FileReader("note.txt")) {
//            int c = fr.read();
//            while(fr.ready()) {
//                System.out.println("File:" + (char) c);
//                c = fr.read();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //BufferedReader -> Wrapper over InputStreamReader
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            System.out.println("Line read:" + br.readLine());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
//            System.out.println("Line read from file:" + br.readLine());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
