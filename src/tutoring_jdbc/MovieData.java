package tutoring_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MovieData
{
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC";
        String username = "root";
        String password = "root";

        Connection connection = null;
        Statement statement = null;

        MovieList jumpStreet22 = new MovieList(
                18,
                "22 Jump Street",
                2014,
                "Action/Adventure",
                "R");

        MovieList hangover = new MovieList(
                19,
                "The Hangover",
                2009,
                "Comedy",
                "R");

        MovieList terminator = new MovieList(
                20,
                "Terminator: Dark Fate",
                2019,
                "Fantasy/Sci-fi",
                "R");


        ArrayList<MovieList> movies = new ArrayList<MovieList>();

        movies.add(jumpStreet22);
        movies.add(hangover);
        movies.add(terminator);

        try {

            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();



            for (MovieList mov : movies) {
                String query = "INSERT INTO movie(id, title, releaseYear, genre, mpaaRating)" +
                        " VALUES (" + mov.getId() + ", '" + mov.getTitle() + "', " + mov.getReleaseYear()
                        + ", '" + mov.getGenre() + "', '" + mov.getMpaaRatings() + "' );";

                statement.execute(query);
            }

        }catch (Exception e)
        {
            System.out.println("sorry there has been an error, please check the code again");
            e.printStackTrace();
        }finally {
            connection.close();
            statement.close();
        }
    }
}
