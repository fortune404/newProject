package tutoring_Stack;

import java.util.Stack;

public class HospitalPatients
{
    public static void main(String[] args)
    {
        Stack <String> patients = new Stack<String>();

        patients.push("Katy");
        patients.push("Miley");
        patients.push("Nikki");
        patients.push("Paige");
        patients.push("Trish");


//        System.out.println(patients.peek());
//        System.out.println(patients.search("Trish"));           //node 1
//        patients.pop();             //removed node 1
//        System.out.println(patients.search("Paige"));

        //--------------------------------------------------------------------------------------------------------------

        HospitalPatients names = new HospitalPatients();

        names.patients();



    }

    public Stack<String>patients()
    {
        Stack <String> id = new Stack<>();
        id.push("Rebbeca");
        id.push("Debra");
        id.push("Dexter");
        id.push("Morgan");


        System.out.println(id.peek());
        id.pop();
        System.out.println(id.search("Dexter"));
        System.out.println(id.peek());

        //id = new Stack();



        return id;
    }
}
