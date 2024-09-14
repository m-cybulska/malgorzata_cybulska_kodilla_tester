import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {

    @Test
    public void filterShouldReturnChemists() {

        List<String> result = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Walter White");
        expectedResult.add("Gale Boetticher");

        assertEquals(expectedResult, result);
    }

    @Test
    public void filterShouldReturnUsersAbove45() {

        List<String> result = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > 45)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Walter White");
        expectedResult.add("Gus Firing");
        expectedResult.add("Mike Ehrmantraut");

        assertEquals(expectedResult, result);
    }

    @Test
    public void filterShouldReturnUsersWithPostNumberAbove115() {

        List<String> result = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 115)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Jessie Pinkman");
        expectedResult.add("Tuco Salamanca");

        assertEquals(expectedResult, result);
    }
}
