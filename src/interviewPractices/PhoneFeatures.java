package interviewPractices;

public abstract class PhoneFeatures
{
    public abstract void display(String type);
    public abstract void shape(int Size);
    public abstract void colors(String type);
    public void software(String softwareNAme)
    {
        if (softwareNAme.equals("IOS"))
        {
            System.out.println("welcome to ios. \nSwitch of the phone and turn it back on to use Android");
        }else if (softwareNAme.equals("ANDROID"))
        {
            System.out.println("welcome to android. \nSwitch od the phone and turn it back on to use ios");
        }else
            {
                System.out.println("This Function doesn't exist in this phone");
            }
    }

}
