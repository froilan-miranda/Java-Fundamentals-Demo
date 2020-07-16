package com.codedifferently.exceptions;

import java.io.*;

class FilePrinter {
    private final BufferedReader reader;

    public FilePrinter(String fileDirectory) throws FileNotFoundException {
        // What if the file does not exist?
        File file = new File(fileDirectory);
        this.reader = new BufferedReader(new FileReader(file));
    }

    public void printFile()  throws IOException{
        String line = null;
        do {
            // What if the System fails to read in the next line?
            // (For example if the file was suddenly closed, modified, or deleted)
            line = reader.readLine();
            System.out.println(line);
        } while (line != null);
    }

    public void tryPrintFile() {
        try {
            printFile();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}