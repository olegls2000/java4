package Lessons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class L12Main {
    public static void main(String[] args) {

        throwRTException();
        try {
            throwException();
        } catch (Exception ex) {
            System.out.println("");
            ex.printStackTrace();
        }
        try {
            getFileAccessTr();
            getFileAccessExc();
            getFileAccessFNFE();
        } catch (FileNotFoundException Tr) {
            System.out.println("FileNotFoundException caught ");
        } catch (Exception Tr) {
            System.out.println("Exception caught");
        } catch (Throwable Tr) {
            System.out.println("Throwable caught");
        } finally {
            System.out.println("hello from finally");
        }
        someMeth();

        PrintWriter writer = null;
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    static void someMeth(){
        try{
            System.out.println("hello from try");
            return;
        }finally {
            System.out.println("will i print after return?");
        }
    }

    static void getFileAccessTr()throws Throwable{
        File testFile = new File(".");
        FileInputStream reader = new FileInputStream(testFile);
    }

    static void getFileAccessExc()throws Exception{
        File testFile = new File(".");
        FileInputStream reader = new FileInputStream(testFile);
    }
    static void getFileAccessFNFE()throws FileNotFoundException {
        File testFile = new File(".");
        FileInputStream reader = new FileInputStream(testFile);
    }



    static void throwRTException() {
        throw new RuntimeException();

    }
     static void throwException() throws Exception{
            throw new Exception();
        }




}