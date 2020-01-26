package com.julia.Action;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public abstract class Action {

    protected String filename;
    protected String outputFilename;

    public Action(String filename, String outputFilename) {
        this.filename = filename;
        this.outputFilename = outputFilename;
    }

    public void performAction() throws IOException {
        List<String> content = fileToList();   //сервисная логика
        perform(content);                      //бизнес логика
        listToFile(content);                   //сервисная логика
    }

    protected abstract void perform(List<String> content);



    private void listToFile(List<String> content) throws IOException {
       try (PrintWriter pw = new PrintWriter(outputFilename)) {
           for (String line : content) {
               pw.println(line);
           }
       }
    }


    private List<String> fileToList() throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));

        String in;

        while ((in = br.readLine()) != null) {
            lines.add(in);
        }
        return lines;
    }

}