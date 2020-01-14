import java.util.ArrayList;

// !!! DO NOT MODIFY THIS CLASS !!!
// ********************************
public class Student implements Comparable<Student>
{ 
    private ArrayList<Course> coursesTaken; // list of courses this student has taken
    private String name;    // name of this Student
    
    /**
     * Creates a student with the specified name. By default, this student will have taken 0 courses.
     */
    public Student(String myName)
    {
        name = myName;
        coursesTaken = new ArrayList<Course>();
    }
    
    /**
     * Adds a course to the list of courses that this student has taken.
     * @param myCourse the new course to add to the list of courses taken
     */
    public void addCourse(Course myCourse)
    {
        coursesTaken.add(myCourse);
    }

    /**
     * Returns the name of this student.
     * @return the name of this student.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Precondition: this student has taken at least one course.
     * Postcondition: returns an ArrayList of the Courses this  
     * student has taken.
     * @return an ArrayList of the Courses that this student has taken
     */
    public ArrayList<Course> getCoursesTaken()
    {   return coursesTaken;    }

    /**
     * Precondition: this student has taken at least one course.
     * Postcondition: returns true if this student's total number of 
     *  credits is >125, false otherwise.
     * @return true if this student is a senior, false otherwise.
     */
    public boolean isSenior()
    {
        int totalCredits = 0;
        
        for (Course current : coursesTaken)
        {
            totalCredits += current.getNumberOfCredits();
        }
        
        return (totalCredits > 125);
    }
    
    /**
     * Returns the total number of credits that this student has taken thus far.
     * @return the total number of credits that this student has taken thus far.
     */
    public int getTotalCredits()
    {
        int totalCredits = 0;
        
        for (Course current : coursesTaken)
        {
            totalCredits += current.getNumberOfCredits();
        }
        return totalCredits;
    }
    
    /**
     * Compares two students by number of credits taken.
     * @param other The other student to compare to this one
     * @return A positive number if this student has taken more credits than the other student,
     *         A negative number if this student has taken fewer credits than the other student,
     *         0 if the two students have taken the same number of credits
     */
    public int compareTo(Student other)
    {
        if (this.getTotalCredits() > other.getTotalCredits())
            return 1;
        else if (this.getTotalCredits() < other.getTotalCredits())
            return -1;
        else
            return 0;
    }
    
    /**
     * Returns the string representation of this student,
     * which is of the format: Student Name: Total Credits = # credits
     * @return the string representation of this student
     */
    public String toString()
    {
        return getName() + ": Total Credits = " + getTotalCredits();
    }
}
