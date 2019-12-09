package tutoring_jdbc_retrieve;

import java.sql.*;

public class  RetrieveData2
{
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC";
        String username = "root";
        String password = "root";
        String query = "SELECT * FROM movie;";
        Connection connection = null;
        Statement statement = null;
        ResultSet table = null;



//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        }catch (ClassNotFoundException cn)
//        {
//            System.out.println("check driver");
//            cn.printStackTrace();
//        }

        //Connecting to JDBC
        connection = DriverManager.getConnection(url,username,password);

        //Statement
        statement = connection.createStatement();

        //ResultSet for the statement
        table = statement.executeQuery(query);


        System.out.println("id"+"  "+"title"+"  "+"releaseYear"+"  "+"genre"+"  "+"mpaaRating");
        while (table.next())
        {
            String value1 = table.getString("id");
            String value2 = table.getString("title");
            String value3 = table.getString("releaseYear");
            String value4 = table.getString("genre");
            String value5 = table.getString("mpaaRating");
            System.out.println(value1+"  "+value2+"  "+value3+"  "+value4+"  "+value5);
        }
        connection.close();
        statement.close();
    }
}
