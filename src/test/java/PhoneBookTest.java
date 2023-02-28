import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    PhoneBook pb;

    @BeforeEach
    public void init() {
        pb = new PhoneBook();
    }

    @BeforeAll
    public static void started() {

    }

    @AfterEach
    public void finished() {

    }

    @Test
    public void testAdd() {
        String name = "Гриша", tel = "891785858585";
        int expected = 1;

        int result = pb.add(name,  tel);

        assertEquals(expected, result);
    }
}
