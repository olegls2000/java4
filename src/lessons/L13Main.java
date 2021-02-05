package lessons;

import model.geoShapes.Circle;

import java.io.*;

public class L13Main {
    public static void main(String[] args) {

        // Reflection:
        Object obj = new Circle();
        final Class<?> aClass = obj.getClass();
        System.out.println(aClass.getName());
        System.out.println(aClass.getMethods());


        //throwRException();
        //someMethod();
        try {
            throwException();
        } catch (Exception x) {
            System.out.println("Exception caught.");
            x.printStackTrace();
        }

        try {
            throwException();
            throwRException();
            getFileAccess();
            getFileAccessExc();
            getFileAccessFNFE();
        } catch (FileNotFoundException x) {
            System.out.println("FileNotFoundException caught.");
            //System.err.println("FileNotFoundException caught.");
            //x.printStackTrace();
            //x.getCause();
        } catch (Exception x) {
            System.out.println("Exception caught.");
            //x.printStackTrace();
        } catch (Throwable x) {
            System.out.println("Throwable caught.");
            //x.printStackTrace();
        } finally { // will always run
            System.out.println("Hello from Finally.");
        }

        // catch (Throw | Throw2 | Throw3) symbol = pipe

        PrintWriter writer = null; // find from alishev.
        try {
            writer = new PrintWriter(new File("someFile.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

        try (PrintWriter newWriter = new PrintWriter(new File("someFile.txt"))) {
                newWriter.println(11);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Hey ho");
    }

    static int someMethod() {
        try {
            System.out.println("Hello from Try");
            return 1;
        } finally {
            System.out.println("Will I print after return? -Yes!");
        }
    }

    static void getFileAccess() throws Throwable {
        File testFile = new File("./test.txt");
        FileInputStream reader = new FileInputStream(testFile);
    }

    static void getFileAccessExc() throws Exception {
        File testFile = new File("./test.txt");
        FileInputStream reader = new FileInputStream(testFile);
    }

    static void getFileAccessFNFE() throws FileNotFoundException {
        File testFile = new File("./test.txt");
        FileInputStream reader = new FileInputStream(testFile);
    }

    static void throwRException() {
        throw new RuntimeException();
    }

    static void throwException() throws Exception {
        throw new Exception();
    }
}
