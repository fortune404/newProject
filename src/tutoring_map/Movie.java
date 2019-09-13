package tutoring_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movie
{
    public static void main(String[] args)
    {
        List<String> horrorMovies = new ArrayList<>();
        horrorMovies.add("HALLOWEEN");
        horrorMovies.add("CULT OF CHUCKY");
        horrorMovies.add("PARANORMAL ACTIVITY");
        horrorMovies.add("LIGHTS OUT");
        horrorMovies.add("SINISTER");

        List<String> actionMovies = new ArrayList<>();
        actionMovies.add("MISSION IMPOSSIBLE");
        actionMovies.add("X-MEN");
        actionMovies.add("FAST AND FURIOUS");
        actionMovies.add("AVENGERS");
        actionMovies.add("VENOM");

        Map<String,List > movie = new HashMap<>();
        movie.put("Action",actionMovies);
        movie.put("Horror",horrorMovies);

        for (Map.Entry<String,List>map: movie.entrySet())
        {
            System.out.println(map.getKey()+" "+map.getValue());
        }



    }
}
