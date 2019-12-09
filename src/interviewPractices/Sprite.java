package interviewPractices;

public class Sprite extends ColdDrink
{

    @Override
    public void brands(String name) {
        System.out.println(name+ " is the owner of Fanta");
    }

    @Override
    public void locations(String loc1)
    {
        System.out.println("Sprite's Headquarters is in "+ loc1);
    }

    public void locations(String loc1, String loc2)
    {
        System.out.println("Sub offices are located in "+loc1+" and "+ loc2);
    }
}
