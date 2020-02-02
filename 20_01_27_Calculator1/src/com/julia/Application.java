package com.julia;
import com.julia.calculator.CharCalculator;
import com.julia.calculator.ICalculator;
import com.julia.calculator.SimpleCalculator;
import com.julia.util.FileOperations;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Application {

//    String INPUT_FILENAME = args[0];
//    String OUTPUT_FILENAME = args[1];

    private static final String INPUT_FILENAME = "input.txt";
    private static final String OUTPUT_FILENAME = "output.txt";


    public static void main(String[] args) throws FileNotFoundException {

        String inputFilename = INPUT_FILENAME;
        String outputFileName = OUTPUT_FILENAME;

        if (args.length > 0) {
            inputFilename = args[0];
        }

        if (args.length > 1) {
            outputFileName = args[1];
        }

        FileOperations fo = new FileOperations();

        List<String> content;
        try {
            content = fo.fileToList(inputFilename);
        } catch (IOException e) {
            List<String> errorList = Arrays.asList("No file " + inputFilename + " found");
            fo.listToFile(errorList, outputFileName);
            e.printStackTrace();
            return;
        }

        ICalculator calculator = new CharCalculator();
        OperationProcessor processor = new OperationProcessor(calculator);
        List<String> outputContent = processor.processStrings(content);

        fo.listToFile(outputContent, outputFileName);
    }
}
