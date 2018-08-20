public class Flying extends Animal
{
    //fields
    private int numWings;   

    //getter
    public int getNumWings()
    {
        return numWings;
    }
    
    //setter
    public void setNumWings(int inNumWings)
    {
        if(inNumWings % 2 != 0)
        {
            throw new IllegalArgumentException("Invalid Number of Wings!");
        }

        numWings = inNumWings;
    }

    public String toString()
    {
        return "F, " + Animal.getSpecies() + ", " + Animal.getMass() + ", " + numWings;
    }

}
