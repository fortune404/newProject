package interviewPractices;

public enum States
{
    NEW_YORK("New York","NY","ALBANY"),
    ARIZONA("ARIZONA","AZ","PHOENIX");

    private String name;
    private String abbreviation;
    private String capital;

    States(String name, String abbreviation, String capital) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCapital() {
        return capital;
    }
}
