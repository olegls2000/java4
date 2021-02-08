package lessons;

import model.Circle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class L13Main {
    //Exeptions
    public static void main(String[] args) throws Exception {
        //throwRTExeption();
        try {
            throwExeption();
        } catch (Exception ex) {
            System.out.println("Exeption caught");
            ex.printStackTrace();
        }
        try {
            getFileAcces();
            throwExeption();
            getFileAccesExc();
            getFileAccesFNF();
        } catch (FileNotFoundException tr) {
            System.out.println("File not found exeption caught");
            tr.printStackTrace();
            tr.getCause();
        } catch (Exception tr) {
            System.out.println("Exeption caught");
        } catch (Throwable tr) {
            System.out.println("Trowable caught");
        } finally {
            System.out.println("Hello from Finally!!!");
        }

        someMethod();

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File("someFile.txt"));
            writer.println(11);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

        try (PrintWriter newWritter = new PrintWriter(new File("someFile.txt"))){
            newWritter.println(12);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("ggg");


        //Reflection
        Object obj = new Circle();

        final Class<?> aClass = obj.getClass();
        System.out.println(aClass.getName());
        System.out.println(aClass.getMethods().length);


    }

    static int someMethod() {
        try {
            System.out.println("Hello from try");
            return 1;
        } finally {
            System.out.println("Will i print after return?");
        }
    }

    static void getFileAcces() throws Throwable {
        File testFile = new File("./text.txt");
        FileInputStream reader = new FileInputStream(testFile);
        reader.close();
    }

    static void getFileAccesExc() throws Exception {
        File testFile = new File("./text.txt");
        FileInputStream reader = new FileInputStream(testFile);
    }

    static void getFileAccesFNF() throws FileNotFoundException {
        File testFile = new File("./text.txt");
        FileInputStream reader = new FileInputStream(testFile);
    }

    static void throwRTExeption() {
        throw new RuntimeException();
    }

    static void throwExeption() throws Exception {
        throw new Exception();
    }
}
