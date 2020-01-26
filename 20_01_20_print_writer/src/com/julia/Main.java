package com.julia;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        printBuffered();
    }

    public static void printBuffered() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("lines.txt"); //(System.out); напечатаетв консоль
        pw.println("Hello");
        pw.println("Hello");
        pw.println("Hello");
        pw.println("Hello");
        pw.println("Hello");
        pw.flush();
        pw.println("Hello");
        pw.println("Hello");
        pw.println("Hello");
        pw.flush();             // закрыть
        pw.println("World");
        pw.println("World");
    }

    public static void printNonBuffered() throws FileNotFoundException {
        PrintStream pw = new PrintStream(new FileOutputStream("lines.txt"));
//        PrintStream pw = new PrintStream(System.out);
        pw.println("Hello");
        pw.println("Hello");
        pw.println("Hello");
        pw.println("Hello");
        pw.println("Hello");
        pw.println("World");
        pw.println("World");
        pw.println("World");
        pw.println("World");
        pw.println("World");
    }
}
