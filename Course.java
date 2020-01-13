public class Course
{
    // !!! DO NOT MODIFY THIS CLASS !!!
    // ********************************
    private String name;        // name of this course
    private String block;       // course block when this course meets
    private int credits;        // number of credits this course is worth

    /**
     * Creates a new course with the specified name, is worth a specified number of credits, and meets during the specified block.
     * @param myName the name of this course
     * @param myCredits how many credits this course is worth
     * @param myBlock in what schedule block does this course meet (must be a valid block)
     * @throws IllegalArgumentException if an invalid block is provided
     */
    public Course(String myName, int myCredits, String myBlock)
    {
        name = myName;
        credits = myCredits;
        if (!validBlock(myBlock))
            throw new IllegalArgumentException("Specified block (" + myBlock + ") is not a valid schedule block.");
        block = myBlock;
    }

    /**
     * Returns the name of this course.
     * @return the name of this course
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the block in which this course meets.
     * @return the block in which this course meets.
     */
    public String getBlock()
    {
        return block;
    }
    
    /**
     * Returns the number of credits this course is worth.
     * @return the number of credits this course is worth (between 0 and 6 exclusive)
     */ 
    public int getNumberOfCredits()
    {   return credits;    }

    /**
     * Returns the string representation of this course,
     * which is of the format: Course name (# credits)
     * @return the string representation of this course
     */
    public String toString()
    {
        return getName() + " (" + getNumberOfCredits() + " credits)";
    }

    // DO NOT MODIFY THE METHODS BELOW
    /**
     * precondition: toCheck is not null
     * postcondition: returns true if toCheck is a valid schedule block, false otherwise.
     */
    private boolean validBlock(String toCheck)
    {
        String[] blocks = {"123x2","2144x","3x134","43x21","x4213","57x65","6567x","x6556"};
        for (String curBlock : blocks)
        {
            if (toCheck.equals(curBlock))
                return true;
        }
        return false;
    }
}
