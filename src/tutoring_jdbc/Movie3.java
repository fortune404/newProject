package tutoring_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Movie3
{
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;

        try {

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
                    "root",
                    "root");

            statement = connection.createStatement();

            String query = "INSERT INTO movie(id, title, releaseYear, genre, mpaaRating) " +
                    "VALUES(17, 'Halloween', 2018, 'Slasher/Thriller', 'R');";
            statement.execute(query);

        }catch (Exception e)
        {
            System.out.println("sorry there has been an error, please try again");
            e.printStackTrace();
        }finally {
            connection.close();
            statement.close();
        }
    }
}
