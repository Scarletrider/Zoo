public class Terrestrial extends Animal
{
    //fields
    private int numLegs;
    
    //getter
    public int getNumLegs()
    {
        return numLegs;
    }    
    
    //setter
    public void setNumLegs(int inNumLegs)
    {
        if(inNumLegs % 2 != 0)
        {
            throw new IllegalArgumentException("Invalid Number of Legs!");
        }

        numLegs = inNumLegs;
    }

    //toString
    public String toString()
    {
        return "T, " + Animal.getSpecies() + ", " + Animal.getMass() + ", " + numLegs;
    }    
}
