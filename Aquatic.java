public class Aquatic extends Animal
{
    //fields
    private int numFins;    
    
    //getter
    public int getNumFins()
    {
        return numFins;
    }
    
   //setter
    public void setNumFins(int inNumFins)
    {
        if(inNumFins % 2 != 0 || inNumFins % 3 !=0)
        {
            throw new IllegalArgumentException("Invalid Number of Fins!");
        }

        numFins = inNumFins;
    }
   
    public String toString()
    {
        return "A, " + Animal.getSpecies() + ", " + Animal.getMass() + ", " + numFins;
    }
}
