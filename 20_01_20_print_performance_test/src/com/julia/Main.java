package com.julia;

import com.julia.printer.PrintStreamPrinter;
import com.julia.printer.PrintWriterPrinter;
import com.julia.printer.PrinterInterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        PrinterInterface printStreamWrapper = new PrintStreamPrinter(
                new PrintStream(new FileOutputStream("print_stream.txt"))
        );

        PrinterInterface printWriterWrapper = new PrintWriterPrinter(
                new PrintWriter("print_writer.txt")
        );

        PrinterPerformanceTester ppt = new PrinterPerformanceTester(printStreamWrapper);
        System.out.println("Result for PrintStream is:");
        System.out.println(ppt.testNLines(10000, "Hello"));

        ppt = new PrinterPerformanceTester(printWriterWrapper);
        System.out.println("Result for PrintWriter is:");
        System.out.println(ppt.testNLines(10000, "Hello"));

    }
}
