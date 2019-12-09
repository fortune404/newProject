package interviewPractices;

public class VehicleDemo
{
    public static void main(String[] args)
    {
        AstonMartin astonMartin = new AstonMartin();

        astonMartin.engine("V12");
        astonMartin.transmission("Sport");
        astonMartin.color("White","Day");

        System.out.println("----------------");

        RollsRoyce rollsRoyce = new RollsRoyce();

        rollsRoyce.engine("V8");
        rollsRoyce.transmission("RollsSport");
        rollsRoyce.color("red","day");
    }
}
