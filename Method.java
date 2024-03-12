package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Method {
    
    public static void processInputFile(String inputFile) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile))) {
            String movieRecord;
            while ((movieRecord = fileReader.readLine()) != null) {
                // Parse CSV movie record
                String[] fields = parseCSV(movieRecord);
                
                // Process each field (not fully implemented in this example)
                for (String field : fields) {
                    System.out.println("Field: " + field);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading input file " + inputFile + ": " + e.getMessage());
        }
    }

    public static String[] parseCSV(String line) {
        // Split line by commas but only if not within double quotes
        return line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
    }
}
