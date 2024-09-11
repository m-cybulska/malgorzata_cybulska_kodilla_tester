import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTestSuite {

    @Test
    public void shouldReturnAvgPostsNumberInAgeGroup40andAbove() {

        List<User> users = new ArrayList<>();
        users.add(new User("Jamie Moore", 40, 10, "Chemists"));
        users.add(new User("Walter Walker", 41, 5, "Chemists"));
        users.add(new User("Frankie White", 39, 50, "Chemists"));
        users.add(new User("Jake Blue", 68, 33, "Chemists"));

        double result = users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();

        double expectedResult = 16;

        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturnAvgPostsNumberInAgeGroupBelow40() {

        List<User> users = new ArrayList<>();
        users.add(new User("Jamie Moore", 40, 10, "Chemists"));
        users.add(new User("Walter Walker", 41, 7, "Chemists"));
        users.add(new User("Frankie White", 39, 50, "Chemists"));
        users.add(new User("Jake Blue", 19, 320, "Chemists"));

        double result = users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(user -> user.getNumberOfPost())
                .average()
                .getAsDouble();

        double expectedResult = 185;

        assertEquals(expectedResult, result);
    }
}
