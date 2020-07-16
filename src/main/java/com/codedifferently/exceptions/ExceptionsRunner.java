package com.codedifferently.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsRunner {
    public static void main(String... args) {
        assert (false);
        try {
            FilePrinter fp = new FilePrinter("/Users/froilan/Desktop/temp/test.txt");
            fp.printFile();
        }catch (Exception e){

        }

    }
}
