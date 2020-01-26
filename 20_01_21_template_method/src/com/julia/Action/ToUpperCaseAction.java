package com.julia.Action;
import java.util.ArrayList;
import java.util.List;



public class ToUpperCaseAction extends Action {

    public ToUpperCaseAction(String filename, String outputFilename) {
        super(filename, outputFilename);
    }

    @Override
    protected void perform(List<String> content) {
        List<String> newContent = new ArrayList<>();
        for (String line: content) {
            newContent.add(line.toUpperCase());
        }
        content.clear();
        content.addAll(newContent);
    }
}
