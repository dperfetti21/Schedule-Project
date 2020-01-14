import java.util.ArrayList;
/**
 * Represents the schedule of a student.
 * 
 * @author (Declinda) 
 * @version (01/25/2019)
 */
public class Schedule
{
    private String[][] sched;   // represents a week's schedule. rows represent periods (0-6)
                                // and columns represent days of the week (0=Monday,1=Tuesday,...,4=Friday)
    private final int NUM_PERIODS = 7;
    private final int NUM_DAYS_IN_WEEK = 5;
                                
    /**
     * Builds the schedule for a given student.
     * @param s the student whose schedule you wish to build
     */
    public Schedule(Student s)
    {
        // your goal is to get the list of courses for the current student,
        // extract the schedule block from each course,
        // and then populate the sched 2-D array with the NAME of the course at all its
        // meeting times.
        //
        // Example: if Math 444 meets in the 57x65 block, then it meets Monday 5th period,
        // Tuesday 7th period, not on Wednesdays, Thursday 6th period, and Friday 5th period.
        // After this constructor finishes running, sched should have been initialized such that:
        // sched[4][0] == "Math 444"   // period 5 on Monday
        // sched[6][1] == "Math 444"   // period 7 on Tuesday
        // sched[5][3] == "Math 444"   // period 6 on Thursday
        // sched[4][4] == "Math 444"   // period 5 on Friday
        //
        // Recall that if you have a String containing an integer and wish to convert it to
        // an int, use the Integer.parseInt(str) method.
        //
        // Example: String s = "4";
        //          int i = Integer.parseInt(s);  // i now contains the int 4

        
        // ALL OF YOUR CODE SHOULD BE CONTAINED WITHIN THIS CONSTRUCTOR
        // ---BEGINNING OF YOUR CODE---
        int numCourses = s.getCoursesTaken().size();
        for( int i=0; i < numCourses; i++)
        {
            ArrayList<String> courses = new ArrayList<String>();
            for(String curCourse : coursesTaken)
            {
                
            }
            int block = courses(i).getBlock;
        }
        
        // ---END OF YOUR CODE ---
    }

    // DO NOT MODIFY ANY CODE BELOW THIS LINE
    /**
     * Prints the schedule to the terminal window
     */
    public void printSchedule()
    {
        System.out.println("  #  |   MONDAY   |  TUESDAY   | WEDNESDAY  |  THURSDAY  |   FRIDAY   |");
        System.out.println("-----------------------------------------------------------------------");
        for (int p = 0; p < NUM_PERIODS; p++)
        {
            System.out.print("  " + (p+1) + "  |");
            for (int d = 0; d < NUM_DAYS_IN_WEEK; d++)
            {
                String curCourse = sched[p][d];
                if (curCourse == null)
                {
                    curCourse = "        ";
                }
                else
                {
                    curCourse += "        ";
                    curCourse = curCourse.substring(0,8);
                }
                System.out.print("  " + curCourse + "  |");
            }
            System.out.println();
            System.out.println("-----------------------------------------------------------------------");
        }
    }
}
