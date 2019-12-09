package interviewPractices;

public class EmployeeListDataBase
{
    public static void main(String[] args)
    {
        EmployeeList defaultt = new EmployeeList();

        EmployeeList employee1 = new EmployeeList
                ("French Montana",30,"french111@gmail,com","Rapper");
        System.out.println(employee1.getEmployeeName());
        System.out.println(employee1.getEmployeeAge());
        System.out.println(employee1.getEmployeeEmail());
        System.out.println(employee1.getEmployeePosition());

        System.out.println("****************");

        EmployeeList employee2 = new EmployeeList
                ("Jimmy Felon",35,"jimmysat146@gmail.com","Comedian");
        employee2.setEmployeeName("Jimmy Kimmel");
        System.out.println(employee2.getEmployeeName()); // name changed
        System.out.println(employee2.getEmployeeAge());
        System.out.println(employee2.getEmployeeEmail());
        System.out.println(employee2.getEmployeePosition());

        System.out.println("****************");

        EmployeeList employee3 = new EmployeeList
                ("Dewayne Johnson",42,"rock2314@yahoo.com","Actor");
        System.out.println(employee3.getEmployeeName());
        System.out.println(employee3.getEmployeeAge());
        employee3.setEmployeeEmail("dewayne2e1371@gmail.com");
        System.out.println(employee3.getEmployeeEmail());   //email changed
        System.out.println(employee3.getEmployeePosition());
    }
}
