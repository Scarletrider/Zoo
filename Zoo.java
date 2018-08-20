import java.util.*;

public class Zoo
{
    public static void creatZoo()
    {        
        Scanner sc = new Scanner(System.in);
        int numOfAnimals = sc.nextInt();

        Animal[] zoo = new Animal[numOfAnimals];
    }
    
    public static void addAnimal()
    {        
        System.out.println("1.Terrestrial");
        System.out.println("2.Aquatic");
        System.out.println("3.Flying"[62~);

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                terrestrial();
                break;
            case 2:
                aquatic();
                break;
            case 3:
                flying();
                break;
            default:
                throw new IllegalArgumentException("Invalid Choice!");
        }
    }

    public static void terrestrial()
    {
        Terrestrial terres = new Terrestrial();
    }

    public static void aquatic()
    {
        Aquatic aqu = new Aquatic();
    }

    public static void flying()
    {
        Flying fly = new Flying();
    }

}
