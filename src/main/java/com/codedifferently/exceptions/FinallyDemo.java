package com.codedifferently.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyDemo {

    public static void main(String... args){}

    public void example1(){
        try
        {
            System.out.println("try block");
        }
        catch (Exception e)
        {
            System.out.println("catch block");
        }
        finally
        {
            System.out.println("finally block");
        }
    }
    public void example2(){
        try
        {
            System.out.println("try block");

            //throw new NullPointerException("Null occurred");
        }
        catch (Exception e)
        {
            System.out.println("catch block");
        }
        finally
        {
            System.out.println("finally block");
        }
    }
    public void example3(){
        try
        {
            System.out.println("try block");

            throw new NullPointerException("Null occurred");
        }
        finally
        {
            System.out.println("finally block");
        }
    }
    public void example4(){
        try
        {
            System.out.println("try block");

            //throw new NullPointerException("null occurred");
        }
        catch (NumberFormatException e)
        {
            System.out.println("catch block 1");
        }
        catch (NullPointerException e)
        {
            System.out.println("catch block 2");
        }
        catch (Exception e)
        {
            System.out.println("catch block 3");
        }
        finally
        {
            System.out.println("finally block");
        }
    }
    public void example5(){
        try
        {
            System.out.println("try block");

            throw new NullPointerException("NullPointerException occured");
        }
        catch (NullPointerException e)
        {
            System.out.println("catch block 1");

            throw new NumberFormatException("NumberFormatException occurred");
        }
        catch (Exception e)
        {
            System.out.println("catch block 2");
        }
        finally
        {
            System.out.println("finally block");
        }
    }
    public void example6(){
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/froilan/Desktop/temp/test.txt")))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                System.out.println(sCurrentLine);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("Hey your file either doesn't exist or was closed prematurely");
        }
    }
}
