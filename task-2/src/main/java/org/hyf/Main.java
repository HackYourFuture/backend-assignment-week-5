package org.hyf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) throws IOException {
        System.out.println("You code goes here :) You can overwrite this entire method.");

        System.out.println("Here's an example of how the file reader is used. Let's print the first 3 rows:");
        // CSV reader functionality: This is how it can be used!
        CsvReader csvReader = new CsvReader();
        ArrayList<String[]> rows = csvReader.readCsv("task-1/library_loans.csv");

        for (int i = 0; i < 3 && i < rows.size(); i++) {
            System.out.println(Arrays.toString(rows.get(i)));
        }
    }
}
