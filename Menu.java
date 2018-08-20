import java.util.*;

public class Menu
{
    public static void menu()
    {
        System.out.println("1.Add animal");
        System.out.println("2.Display animals");
        System.out.println("3.Read in a zoo file");
        System.out.println("4.Write out to zoo file");
        System.out.println("5.Exit");

        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();

        switch(selection)
        {
            case 1:
            Zoo.addAnimal();
            break;

            case 2:
            Animal();
            break;

            case 3:
            Zoo.creatZoo();
            break;

            case 4:
            Zoo.addAnimal();
            break;

            case 5:
            System.out.println("Edit Finish");
            break;

            dafault:
            System.out.println("Invalid Choice!");
            menu();
            break;
        }
    }
}
