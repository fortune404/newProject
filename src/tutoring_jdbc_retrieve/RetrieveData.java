package tutoring_jdbc_retrieve;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class RetrieveData
{
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
                "root",
                "root");
        Statement statement = connection.createStatement();

        String query = "SELECT title FROM movie";

        ResultSet rs = statement.executeQuery(query);
        //statement.execute(query);

        while(rs.next())
        {
            String nickName = rs.getString("title");
            System.out.println(nickName);
        }

    }
}
