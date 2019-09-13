package tutoring_map;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Country
{
    public static void main(String[] args)
    {
        List<String> countryUSA = new ArrayList<>();
        countryUSA.add("NY");
        countryUSA.add("AZ");
        countryUSA.add("FL");
        countryUSA.add("CA");
        countryUSA.add("IL");

        List<String> countryBANGLADESH = new ArrayList<>();
        countryBANGLADESH.add("Sylhet");
        countryBANGLADESH.add("Dhaka");
        countryBANGLADESH.add("Chittagong");
        countryBANGLADESH.add("Comilla");
        countryBANGLADESH.add("Bogura");

        Map <String, List<String>>country = new HashMap<>();

        country.put("Bangladesh",countryBANGLADESH);
        country.put("USA", countryUSA);

        for (Map.Entry<String,List<String>>entry: country.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
