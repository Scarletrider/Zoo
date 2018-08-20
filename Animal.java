public class Animal
{
    //private fields
    private String species;
    private double mass;

    //default
    public Animal()
    {
        species = "0";
        mass = 0;
    }

    //alternate
    public Animal(String inSpecies, double inMass)
    {
        setSpecies(inSpecies);
        setMass(inMass);
    }

    //copy constructor
    public Animal(Animal copy)
    {
        if(copy == null)
        {
            throw new IllegalArgumentException("Invalid copy!");
        }

        species = copy.getSpecies();
        mass = copy.getMass();
    }

    //getter
    public String getSpecies()
    {
        return species;
    }

    public double getMass()
    {
        return mass;
    }

    //setter
    public void setSpecies(String inSpecies)
    {
        species = inSpecies;
    }

    public void setMass(double inMass)
    {
        if(inMass < 0)
        {
            throw new IllegalArgumentException("Invalid Mass!");
        }
        mass = inMass;
    }

}
