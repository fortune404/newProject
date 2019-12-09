package interviewPractices;

public class Coke extends ColdDrink {
    @Override
    public void brands(String name)
    {
        System.out.println(name+ " is the owner of GingerAle");
    }

    @Override
    public void locations(String loc1)
    {
        System.out.println("Coke's Headquarters is in "+ loc1);
    }

    public void locations(String loc1, String loc2)
    {
        System.out.println("Sub offices are located in "+loc1+" and "+ loc2);
    }

}
