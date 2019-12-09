package interviewPractices;

public class TestStates
{
    public static void main(String[] args)
    {
        System.out.println(States.NEW_YORK.getName());
        System.out.println("The abbreviation of Arizona is "+States.ARIZONA.getAbbreviation());
        System.out.println("---------------------------------");
        switch (States.NEW_YORK)
        {
            case NEW_YORK:
                System.out.println(States.NEW_YORK.getCapital()+" is the capital of New York"+"\nIt's very cold in NY");
                break;
            case ARIZONA:
                System.out.println(States.ARIZONA.getCapital()+" is the capital of Arizona"+"\nIt's very hot in AZ");
                break;
            default:
                System.out.println("UNKNOWN INPUT");
        }
    }
}
