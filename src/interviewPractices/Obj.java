package interviewPractices;

import java.sql.Struct;

public class Obj
{
    public void activity()
    {
        String[] country = {"USA","Spain","Argentina"};

        for (String countries: country)
        {
            System.out.println(countries);
        }
    }

    public int[] uniqueID()
    {
        int[] jobID = new int[4];
        jobID[0] = 23642;
        jobID[1] = 72275;
        jobID[2] = 92367;
        jobID[3] = 22365;

        for (int ids: jobID)
        {
            System.out.println(ids);
        }
        return jobID;
    }

    public static void vendingMachine(int button,String intro)
    {
        System.out.println(intro);
        switch (button)
        {
            case 1:
                System.out.println("coke");
            break;
            case 2:
                System.out.println("fanta");
            break;
            case 3:
                System.out.println("sprite");
            break;
            default:
                System.out.println("invalid request");
        }
    }

    Obj()
    {

    }

    Obj(String name, int age)
    {
        System.out.println("Hi, My name is "+name+ "\nI'm "+age+ " years old");
    }

    public String engine(String key)
    {
        if (key.equalsIgnoreCase("Mango"))
        {
            System.out.println("Selling mango");
        }else if (key.equalsIgnoreCase("Egg"))
        {
            System.out.println("selling Egg");
        }else
            {
                System.out.println("wrong input");
            }
        return key;
    }
}
