/**
 * Tester class for Schedule
 * 
 * @author (Doug Vermes) 
 * @version (01/08/2017)
 */
public class ScheduleRunner
{
    // !!! DO NOT MODIFY THIS CLASS !!!
    // ********************************
    public static void testSchedule()
    {
        Comparable[] arr = new Comparable[3];

        Student s1 = new Student("Jodie Whittaker");
        s1.addCourse(new Course("Math 444",3,"123x2"));
        s1.addCourse(new Course("AT Computer Science",6,"6567x"));
        s1.addCourse(new Course("Art History",1,"3x134"));
        s1.addCourse(new Course("English 232",2,"43x21"));
        s1.addCourse(new Course("Physics 513",1,"2144x"));
        s1.addCourse(new Course("French 343",1,"57x65"));
        
        Schedule mySchedule = new Schedule(s1);
        mySchedule.printSchedule();
    }
    
}
