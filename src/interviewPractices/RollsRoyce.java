package interviewPractices;

public class RollsRoyce implements CarFeatures
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
            case "RollsSports":
                System.out.println("Car will run on RollsSport now");
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
            if (type.equalsIgnoreCase("Red"))
            {
                System.out.println("Red Color for the day");
            }else
            {
                System.out.println("sorry only Red color available during the day");
            }
        }else if (timeOfTheDay.equalsIgnoreCase("Night"))
        {
            if (type.equalsIgnoreCase("Blue"))
            {
                System.out.println("Blue Color for the night");
            }else
            {
                System.out.println("sorry only Blue color available during night");
            }
        }else
        {
            System.out.println("Sorry only Blue and Red color Available");
        }
    }
}
