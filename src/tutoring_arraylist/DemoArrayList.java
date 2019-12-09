package tutoring_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList
{
    public static void main(String[] args) {


        List<String> students = new ArrayList();
        students.add("Jhon");
        students.add("Adam");
        students.add("David");
        students.add("Mike");

        for (int i = 2; i < students.size(); i++){
            System.out.println(students.get(i));
        }
        System.out.println("---------------------------------");
        Iterator it = students.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("---------------------------------");

        for (String st: students)
        {
            System.out.println(st);
        }

        System.out.println("::::::::");

        List<String>locations = new ArrayList();

        locations.add("New York");
        locations.add("Phoenix");
        locations.add("St. Louis");
        locations.set(2,"Albany");
        locations.remove(0);
        locations.add("New York");


//        for (int l = 0; l < locations.size(); l++)
//        {
//            System.out.println(locations.get(l));
//        }

        Iterator iterator = locations.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }






    }
}
