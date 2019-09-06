package tutoring_arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UseArrayList
{
    /*
    The ArrayList class is a resizable array, which can be found in the java.util package.

     */
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Mercedes");
        cars.add("Lexus");
        cars.add("Corvette");
        cars.add("Acura");
        cars.add("Infiniti");
        cars.set(4,"Lamborghini");      //changes the value of the chosen index

        //Collections.sort(cars);         //it arranges data alphabetically & numerically

        for (int i = 0; i <cars.size();i++)
        {
            System.out.println(cars.get(i));
        }









        ArrayList<Integer>studentId = new ArrayList<Integer>();

        studentId.add(342362);
        studentId.add(663437);
        studentId.add(223342);
        studentId.add(432322);
        studentId.add(123516);
        studentId.set(2,343216);

        System.out.println(studentId.get(2));
        System.out.println("--------");


        for (int i = 0; i< studentId.size();i++)            //using for loop
        {
            System.out.println(studentId.get(i));
        }



        for (Integer i: studentId)                          //using for each loop
        {
            System.out.println(studentId);
        }

        for (Integer i: studentId)                          //using for each loop
        {
            System.out.println(i);
        }




        ArrayList <String> locations =new ArrayList<String>();

        locations.add("NEW YORK");
        locations.add("ARIZONA");
        locations.add("FLORIDA");
        locations.add("VIRGINIA");
        locations.add("TEXAS");
        locations.set(3,"CALIFORNIA");

        for (int i =0; i< locations.size();i++)         //for loop
        {
            System.out.println(locations.get(i));
        }

        System.out.println("------");

        Collections.sort(locations);        //alphabetically locations

        for (String s: locations)                       //for each loop
        {
            System.out.println(s);
        }

    }
}
