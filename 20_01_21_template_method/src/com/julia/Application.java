package com.julia;
import com.julia.Action.Action;
import com.julia.Action.ReverseAction;
import com.julia.Action.SortAction;
import com.julia.Action.ToUpperCaseAction;
import java.io.IOException;



public class Application {

    public static void main(String[] args) throws IOException {
        Action reverse = new ReverseAction("WarPeace.txt", "output.txt");
        reverse.performAction();

        Action toUpperCase = new ToUpperCaseAction("WarPeace.txt", "output_toupper.txt");
        toUpperCase.performAction();

        Action sort = new SortAction("WarPeace.txt", "output_Sort.txt");
        sort.performAction();
    }
}
