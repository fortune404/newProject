package tutoring_removeJunk;

public class ReplaceString
{
    public static void main(String[] args) {

        String string = "@#%$#%??(* Remove Junk from this String@#%^&@@()_*&$#^%*";
        String replace = string.replaceAll("[^a-z A-Z0-9]", "");
        System.out.println(replace);

    }

}
