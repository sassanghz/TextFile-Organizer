package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Driver {
    
    public static String do_part1(String part1_manifest) {
        String part2_manifest = "C:\\Users\\sassa\\OneDrive\\Desktop\\COMP - 249\\Assignments\\Assignment 2\\src\\part1_manifest.txt";
       
        try (BufferedReader reader = new BufferedReader(new FileReader(part1_manifest))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each movie file name
                String inputFile = line;
                Method.processInputFile(inputFile);
            }
        } catch (IOException e) {
            System.err.println("Error reading part1_manifest.txt: " + e.getMessage());
            return null; // Return null to indicate failure
        }

        return part2_manifest;
    }

    public static String do_part2(String part2_manifest) {
        String part3_manifest = "part3_manifest.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(part2_manifest));
            BufferedWriter writer = new BufferedWriter(new FileWriter(part3_manifest));
            
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each movie file name to create a manifest entry for part 3
                // For simplicity, we'll just write the file names as they are
                writer.write(line);
                writer.newLine();
            }
            
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.err.println("Error reading or writing manifest files: " + e.getMessage());
            e.printStackTrace();
        }
        
        return part3_manifest;
    }

    public static String do_part3(String part3_manifest) {
        String part3_output = "part3_output.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(part3_manifest));
            BufferedWriter writer = new BufferedWriter(new FileWriter(part3_output));
            
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each movie file name to create a manifest entry for part 3
                // For simplicity, we'll just write the file names as they are
                writer.write(line);
                writer.newLine();
            }
            
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.err.println("Error reading or writing manifest files: " + e.getMessage());
            e.printStackTrace();
        }

        return part3_output;
    }

    public static void main(String[] args) {
        String part1_manifest = "C:\\Users\\sassa\\OneDrive\\Desktop\\COMP - 249\\Assignments\\Assignment 2\\src\\part1_manifest.txt";
        String part2_manifest = do_part1(part1_manifest);
        System.out.println("Manifest file for part 2: " + part2_manifest);
        /* String part3_manifest = do_part2(part2_manifest);
        do_part3(part3_manifest);*/
        return;
    }
}
