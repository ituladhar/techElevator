package com.techelevator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        /*The program must prompt the user for the following values:
        #1 The search word
        #2 The word to replace the search word with
        #3 The source file
            This must be an existing file. If the user enters an invalid source file, the program indicates this to the user and exits.
        #4 The destination file
            The program creates a copy of the source file with the requested replacements at this location. If the file already exists, it must be overwritten. If the user enters an invalid destination file, the program indicates this to the user and exits.
*/
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("What is the search word?");
            String searchWord = userInput.nextLine();
            if (searchWord.isEmpty()) {
                System.out.println("Not Valid Entry.");
                System.exit(1);
            }

            System.out.println("What is the replacement word?");
            String replacementWord = userInput.nextLine();
            if (replacementWord.isEmpty()) {
                System.out.println("Not Valid Entry.");
                System.exit(1);
            }

            File sourceFilePath;
            System.out.println("What is the source file?");
            String path = userInput.nextLine();
            sourceFilePath = new File(path);
            if (!sourceFilePath.exists()) {
                System.out.println(path + " does not exist.");
                System.exit(1);
            } else if (!sourceFilePath.isFile()) {
                System.out.println(path + " is not a file.");
                System.exit(1);
            }

            File destinationFilePath;
            System.out.println("What is the destination file?");
            path = userInput.nextLine();
            destinationFilePath =  new File(path);
            if (!destinationFilePath.exists()) {
                System.out.println(path + " does not exist");
                System.exit(1);
            } else if (!destinationFilePath.isFile()) {
                System.out.println(path + " is not a file");
                System.exit(1);
            }

            try (Scanner sourceScanner = new Scanner(sourceFilePath.getAbsoluteFile());
                 PrintWriter destinationWriter = new PrintWriter(destinationFilePath.getAbsoluteFile())) {
                while (sourceScanner.hasNextLine()) {
                    String line = sourceScanner.nextLine();
                    destinationWriter.println(line.replaceAll(searchWord, replacementWord));
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}