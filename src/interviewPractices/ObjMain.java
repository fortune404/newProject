package interviewPractices;

public class ObjMain
{
    public static void main(String[] args)
    {
        Obj obExecution = new Obj();

        obExecution.activity();
        obExecution.uniqueID();

        Obj.vendingMachine(3,"WELCOME TO VENDING MACHINE SOUTH");

        Obj obj2 = new Obj("Jay Cutler",34);

        obExecution.engine("Mango");

    }

}
