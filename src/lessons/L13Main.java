package lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class L13Main {
    public static void main(String[] args) {
        throwException();
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File("123.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();


            }
        }
        try (PrintWriter newWriter = new PrintWriter(new File ("smt file.txt"))){
            newWriter.println(11);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("gg");
    }

    static void throwException() {
        throw new RuntimeException();
    }

    static void someMeth() {
        try {
            System.out.println("123");
            return;
        } finally {
            System.out.println("321");
        }
    }
}
