package com.julia;
import com.julia.calculator.ICalculator;
import com.julia.calculator.WrongOperandException;
import java.util.ArrayList;
import java.util.List;


public class OperationProcessor {

    private ICalculator calculator;

    OperationProcessor(ICalculator calculator) {
        this.calculator = calculator;
    }

    private static final String DELIMITER = ",";

    public List<String> processStrings(List<String> lines) {

        List<String> res = new ArrayList<>();

        for (String line : lines) {
            res.add(processString(line));
        }

        return res;
    }

    private String processString(String line) {
        String[] members = line.split(DELIMITER);

        if (members.length != 3) {
            return line + DELIMITER + "Wrong number of members";
        }

        double result = 0;
        try {
            double num1 = Double.parseDouble(members[0]);
            double num2 = Double.parseDouble(members[2]);

            char operand = members[1].charAt(0);    //
            result = calculator.calculate(num1, num2, operand);
        } catch (WrongOperandException e) {
            return line + DELIMITER + "Wrong operation";
        } catch (NumberFormatException e) {
            return line + DELIMITER + "Wrong numbers";
        }

        return line + DELIMITER + result;
    }
}
