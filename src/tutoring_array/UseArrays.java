package tutoring_array;

public class UseArrays
{

    public static void main(String[] args) {


//        String name1 = "Tamanna";
//        String name2 = "Rifath";
//        String name3 = "Raihan";
//        String name4 = "Jakie";
//        System.out.println(name1);
//        System.out.println(name1);
//        System.out.println(name1);
//        System.out.println(name1);
//        System.out.println(name1);
//        System.out.println(name1);

        //array
//        String[] names = new String[4];
//
//        names[0] = "Tamanna";
//        names[1] = "Rifath";
//        names[2] = "Raihan";
//        names[3] = "Jakie";
//
//        System.out.println(names[1]);
//        System.out.println(names[0]);
//        System.out.println(names[3]);
//        System.out.println(names[2]);


        //arrays using for loop

        String[] locations = new String[4];

        locations[0] = "NEW YORK";
        locations[1] = "NEW JERSEY";
        locations[2] = "MEXICO";
        locations[3] = "COLOMBIA";

        for (int i = 0; i < locations.length; i++)
        {
            System.out.println(locations[i]);
        }


        char[] letter = new char[7];

        letter[0] = 'a';
        letter[1] = 'b';
        letter[2] = 'c';
        letter[3] = 'd';
        letter[4] = 'e';
        letter[5] = 'f';
        letter[6] = 'g';

        for (int i = 0; i < letter.length; i++)
        {
            System.out.println(letter[i]);
        }

        String[] names = {"Johnny","Rebbecca","Liam","Eminem"};

        System.out.println();





    }
}

