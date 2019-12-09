package interviewPractices;

public class GPhone extends PhoneFeatures
{

    @Override
    public void display(String type)
    {
        System.out.println("The Display is "+type);
    }

    @Override
    public void shape(int size)
    {
        System.out.println("The shape of the phone is rectangle and the size is "+size+" inch");
    }

    @Override
    public void colors(String type)
    {
        System.out.println("The color of the phone is "+type);
    }
}
