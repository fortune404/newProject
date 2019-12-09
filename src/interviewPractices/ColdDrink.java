package interviewPractices;

public abstract class ColdDrink
{
    public void locations(String loc1)
    {
        System.out.println(loc1);
    }

    public void locations(String loc1, String loc2)
    {
        System.out.println(loc1+" "+loc2);
    }

    public void companies(String comp1, String comp2)
    {
        System.out.println(comp1+ " "+comp2);
    }

    public void companies(String comp1, String comp2, String comp3)
    {
        System.out.println(comp1+ " " +comp2+" "+comp3);
    }

    public abstract void brands(String name);
}
