/**
 * Tests used to check a submission.
 * 
 * All tests in the "test_submission" folder are used for 
 * checking a submission and are executed when the 
 * "Submission" action is invoked.
 * 
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.util.ArrayList;
import java.io.*;


public class SubTest {

    @Test
    public final void testScheduleClass() {

        Student s1 = new Student("Doug Vermes");
        s1.addCourse(new Course("CS 925-1",3,"123x2"));
        s1.addCourse(new Course("CS 925-3",6,"6567x"));
        s1.addCourse(new Course("412-1",1,"3x134"));
        s1.addCourse(new Course("412-2",2,"43x21"));
        s1.addCourse(new Course("CS 925-2",1,"x4213"));
        s1.addCourse(new Course("Bio 513",1,"x6556"));

        Schedule mySchedule = new Schedule(s1);
        File file = new File("schedule_result.txt");

        PrintStream printStream = null;
        FileOutputStream fos = null;
        try
        {
            fos = new FileOutputStream(file);
        }
        catch (java.io.FileNotFoundException ex)
        {
            System.out.println("File not found!");
            assertTrue("File Not Found",false);
            return;
        }
        printStream = new PrintStream(fos);
        //try
        //{
        //    printStream = new PrintStream(fos);
        //}
        //catch (java.io.FileNotFoundException ex)
        //{
        //    System.out.println("File not found!");
        //    assertTrue("File Not Found", false);
        
        //}
        PrintStream realSystemOut = System.out; // save a reference to the original System.out stream (terminal window)
        System.setOut(printStream); // redirects System.out to a file instead of the terminal window

        mySchedule.printSchedule();

        ArrayList<String> studentResult = new ArrayList<String>();
        System.setOut(realSystemOut);
        FileInput.loadWords("schedule_result.txt", studentResult);

        ArrayList<String> correctSchedule = new ArrayList<String>();
        FileInput.loadWords("Root/schedule_solution.txt", correctSchedule);
        System.out.println("Your result:");
        for (String current : studentResult)
        {
            System.out.println(current);
        }

        System.out.println("\nCorrect result:");
        for (String current : correctSchedule)
        {
            System.out.println(current);
        }
        
        boolean result = compareLists(correctSchedule, studentResult);
        System.out.println("Is your schedule output correct? " + result);


        // the actualResult value should be the same as the expectedResult value
        assertTrue("Test schedule", result);
    }

    
    private static boolean compareLists(ArrayList<String> l1, ArrayList<String> l2)
    {
        if (l1 == null || l2 == null)
        {
            return false;
        }

        if (l1.size() != l2.size())
        {
            return false;
        }

        for (int i=0; i < l1.size(); i++)
        {
            if(!l1.get(i).equals(l2.get(i)))
            {
                return false;
            }
        }
        return true;
    }

}
