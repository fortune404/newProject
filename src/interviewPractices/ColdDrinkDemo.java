package interviewPractices;

public class ColdDrinkDemo
{
    public static void main(String[] args) {
        Coke coke = new Coke();

        coke.brands("Accord");
        coke.locations("California");
        coke.locations("Phoenix","Austin");
        coke.companies("starr","wyckoff","bushwich");
        coke.companies("Netflix","Amazon");

        System.out.println("**************");

        Sprite sprite = new Sprite();
        sprite.brands("Jaguar");
        sprite.locations("Salt lake City");
        sprite.locations("Clayton","Detroit");
        sprite.companies("starr","DumboBench","Emblem");
        sprite.companies("Jungle","AliBaba");
    }
}
