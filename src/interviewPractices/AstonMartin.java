package interviewPractices;

public class AstonMartin implements CarFeatures
{

    @Override
    public void engine(String size)
    {
        System.out.println("the size of this engine is "+ size);
    }

    @Override
    public void transmission(String type)
    {
        switch (type)
        {
            case "Automatic":
                System.out.println("Car will run on automatic now");
                break;
            case "Manual":
                System.out.println("Car will run on Manual now");
                break;
            case "Sport":
                System.out.println("Car will run on Sport now");
                break;
            default:
                System.out.println("This function is invalid");
        }
    }

    @Override
    public void color(String type, String timeOfTheDay)
    {
        if (timeOfTheDay.equalsIgnoreCase("Day"))
        {
            if (type.equalsIgnoreCase("White"))
            {
                System.out.println("White Color for the day");
            }else
                {
                    System.out.println("sorry only white color available during the day");
                }
        }else if (timeOfTheDay.equalsIgnoreCase("Night"))
        {
            if (type.equalsIgnoreCase("Black"))
            {
                System.out.println("Black Color for the night");
            }else
                {
                    System.out.println("sorry only Black color available during night");
                }
        }else
            {
                System.out.println("Sorry only Black and White color Available");
            }
    }
}
