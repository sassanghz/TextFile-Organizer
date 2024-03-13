package main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Method {
    
    public static void processInputFile(String inputFile) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                // Parse CSV movie record
                String[] fields = parseCSV(line);
                
                int genreIndex = determineGenreIndex(fields[3]); // Assuming genre is the 4th field
                
                if (genreIndex != -1) {
                    if (genreWriters[genreIndex] == null) {
                        // Create a new CSV file for the genre
                        String filename = "genre_" + genreIndex + ".csv";
                        genreWriters[genreIndex] = new BufferedWriter(new FileWriter(filename));
                    }

                    // Write the movie record to the corresponding genre file
                    genreWriters[genreIndex].write(line);
                    genreWriters[genreIndex].newLine();
                }
            }
            }
        } catch (IOException e) {
            System.err.println("Error reading input file " + inputFile + ": " + e.getMessage());
        }
    

    public static String[] parseCSV(String line) {
        // Split line by commas but only if not within double quotes
        return line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
    }
}
