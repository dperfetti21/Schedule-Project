import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

    // !!! DO NOT MODIFY THIS CLASS !!!
    // ********************************
    
/**
 * Utility class for reading input from a file.
 * 
 * @author (Doug Vermes) 
 */
public class FileInput
{
    /**
     * This method loads a list of words from the specified text file into the ArrayList specified by 
     * the parameter.
     * <br /><br />
     * NOTE: At this point, you do not need to understand the implementation of this method. You
     *       only need to understand the preconditions and postconditions of this method.
     * <br /><br />
     * Preconditions: a is a properly initialized ArrayList<String>; 
     *                words.txt is a text file containing one word per line, and this file must
     *                be located in the same folder as your project.
     * <br /><br />               
     * Postconditions: Each line of the text file is added to ArrayList a as a new element.
     * @param fileName The name of the text file you wish to read from. This file must be located in the same folder as your project.
     * @param a The ArrayList<String> you wish to store the lines of text in.
     **/
    public static void loadWords(String fileName, ArrayList<String> a)
    {
        Scanner in;
        
        try
        {
            in = new Scanner(new File(fileName));
            // above creates a Scanner object that reads from the specified file
        }
        catch (java.io.FileNotFoundException e)
        {
            System.out.println("FileNotFoundException: " + e.getMessage());
            return;
        }
        
        while (in.hasNextLine())
        {
                a.add(in.nextLine());   // adds the next line of text to a as an element of the ArrayList
        }        
    }
    
    /**
     * This method loads a list of integers from the specified text file into the ArrayList specified by 
     * the parameter.
     * <br /><br />
     * NOTE: At this point, you do not need to understand the implementation of this method. You
     *       only need to understand the preconditions and postconditions of this method.
     * <br /><br />
     * Preconditions: a is a properly initialized ArrayList<Integer>; 
     *                words.txt is a text file containing one integer per line, and this file must
     *                be located in the same folder as your project.
     * <br /><br />               
     * Postconditions: Each line of the text file is added to ArrayList a as a new element.
     * @param fileName The name of the text file you wish to read from. This file must be located in the same folder as your project.
     * @param a The ArrayList<Integer> you wish to store the integers in.
     **/
    public static void loadIntegers(String fileName, ArrayList<Integer> a)
    {
        Scanner in;
        
        try
        {
            in = new Scanner(new File(fileName));
            // above creates a Scanner object that reads from the specified file
        }
        catch (java.io.FileNotFoundException e)
        {
            System.out.println("FileNotFoundException: " + e.getMessage());
            return;
        }
        
        while (in.hasNextInt())
        {
                a.add(in.nextInt());   // adds the next line of text to a as an element of the ArrayList
        }        
    }    
}
