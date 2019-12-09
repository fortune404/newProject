package interviewPractices;

public class EmployeeList
{
    private String employeeName;
    private int employeeAge;
    private String employeeEmail;
    private String employeePosition;

    public EmployeeList() {

    }

    public EmployeeList(String employeeName,int employeeAge, String employeeEmail,String employeePosition)
    {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeEmail = employeeEmail;
        this.employeePosition = employeePosition;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }
}
