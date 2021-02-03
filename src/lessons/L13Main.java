package lessons;

import model.Circle;
import model.Triangle;

import java.io.*;
import java.lang.reflect.Method;
import java.net.SocketException;

public class L13Main {
    //Exception Handling
    public static void main(String[] args) {
        //throwRTException();

        try {
            throwException();
        } catch (Exception ex) {
            System.out.println("Exception caught");
            ex.printStackTrace();
        }
        try {
            getFileAccessTr();
            throwException();
            getFileAccessExc();
            getFileAccessFNFE();
        } catch (FileNotFoundException | SocketException tr) {
            System.out.println("FileNotFoundException caught");
            tr.printStackTrace();
            tr.getCause();
        } catch (Exception tr) {
            System.out.println("Exception caught");
        } catch (Throwable tr) {
            System.out.println("Throwable caught");
        } finally {
            System.out.println("Hello from Finally!!!");
        }

        someMeth();

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

        try (PrintWriter newWriter = new PrintWriter(new File("someFile.txt"))) {
            newWriter.println(11);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("ggg");



        //Reflection:
        Object obj = new Circle();








        final Class<?> aClass = obj.getClass();
        System.out.println(aClass.getName());
        final Method[] methods = aClass.getMethods();
        System.out.println(aClass.getMethods().length);

    }

    static void someMeth() {
        try {
            System.out.println("Hello from try");
            return;
        } finally {
            System.out.println("Will I print after return?  -Yes!");
        }
    }

    static void getFileAccessTr() throws Throwable {
        File testFile = new File("./test.txt");
        FileInputStream reader = new FileInputStream(testFile);
        reader.close();
    }

    static void getFileAccessExc() throws Exception {
        File testFile = new File("./test.txt");
        FileInputStream reader = new FileInputStream(testFile);
    }

    static void getFileAccessFNFE() throws FileNotFoundException {
        File testFile = new File("./test.txt");
        FileInputStream reader = new FileInputStream(testFile);
    }


    static void throwRTException() {
        throw new RuntimeException();
    }

    static void throwException() throws Exception {
        throw new Exception();
    }
}
