package tutoring;

public class Practices
{
    /*
        Access modifiers:  controls the access level
    default
    public
    private
    protected

        Non - Access modifiers: do not control access level, but provides other functionality
    final
    abstract
    static
    synchronized
    volatile

        Primitive data types: A primitive data type specifies the size and type of variable values, and it has no additional methods
    byte
    short
    int
    long
    float
    double
    boolean
    char

        Non - Primitive data types: Non-primitive data types are called reference types because they refer to objects.
    String
    classes
    interface
    Arrays
    etc...
     */

    final static String NAME = "Raihan Kabir";

    public static void main(String[] args) throws InterruptedException {
        int x = 23;
        int y = 50;

        int z = x+y;

        z += 2;

        System.out.println(z);

        int a = 3;
        int b = 34;

        boolean ab = a > b;

        a++;

        System.out.println(ab);

        String name = "Raihan";
        char coffee = '\u2615';
        System.out.println(coffee);
        System.out.println("My name is "+name);
        System.out.println("My name is "+ name + '.'+"\nI'm from NY "+ "\u2615");

        String message1 = "This Phoenix, City of sun";

        String uppercase = message1.toUpperCase();          //uppercase
        System.out.println(uppercase);

        String lowerCase = message1.toLowerCase();          //lowercase
        System.out.println(lowerCase);

        System.out.println(message1.equalsIgnoreCase("This Phoenix, City of sun"));
        System.out.println(message1.endsWith("City of sun"));

        String message2 =  "Welcome To The pool in florida keys";
        System.out.println(message2.indexOf("in"));
        System.out.println(message2.indexOf('o'));  // example of 1st occurrence
        System.out.println(message2.indexOf('e',message2.indexOf('e')+1)); //example of 2nd occurrence
        System.out.println(message2.charAt(5));
        System.out.println(message2.substring(0,10));       //substring

        Thread.sleep(1000);

        String message3 = "   yeah that way, i used to trap outta subway   ";

        System.out.println(message3.trim());

        System.out.println(message3.length());

        final int ID = 214255356;

        System.out.println("My id number is "+ ID+"\nMy name is "+NAME);        // example of use of final variables

        String item;
        item = "sprite";

        if (item.equalsIgnoreCase("Coke")||item.equalsIgnoreCase("coca-cola"))
        {
            System.out.println("dispensing coke");
        }else if (item.equalsIgnoreCase("sprite"))
        {
            System.out.println("dispensing sprite");
        }else
            {
                System.out.println("wrong input");
            }


        String day = "Tuesday";
        switch (day)
        {
            case "Monday":
                System.out.println("Running");
                break;
            case "Tuesday":
                System.out.println("Cooking");
                break;
            case "Wednesday":
                System.out.println("Swimming");
                break;
            case "Thursday":
                System.out.println("Movies");
                break;
            default:
                System.out.println("Nothing is scheduled for that input");
        }


        int goal = 0;
        while (goal < 5)
        {
            System.out.println(goal);
            goal++;
        }

        System.out.println("******");

        int score = 0;
        do {
            System.out.println(score);
            score++;
        }while (score < 5);

        System.out.println("::::::::::::::::::::::");

        for (int dice = 0; dice < 5; dice++)
        {
            System.out.println(dice);
        }

        for (int yu = 0; yu < 5; yu++)
        {
            for (int j = 0; j < yu; j++)
            {
                System.out.print("+");
            }
                System.out.println("*");
        }


        // There is also a "for-each" loop, which is used exclusively to loop through elements in an array
//ex: 1
        String [] array = new String[3];

        array[0] = "rick ross";
        array[1] = "Lil wayne";
        array[2] = "The Game";

        for (String var: array)
        {
            System.out.println(var);
        }

//ex: 2
        String [] cars = {"bmw","Mercedes", "Corvette"};

        for (String c: cars)
        {
            System.out.println(c);
        }
    }
}
