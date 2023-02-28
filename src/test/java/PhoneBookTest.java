import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class PhoneBookTest {
    PhoneBook pb;

    @BeforeEach
    public void init() {
        pb = new PhoneBook();

        String name1 = "Гриша", tel1 = "891785858585";
        String name2 = "Ася", tel2 = "89178534232";
        pb.add(name1,  tel1);
        pb.add(name2,  tel2);
    }

    @BeforeAll
    public static void started() {

    }

    @AfterEach
    public void finished() {

    }

    @Test
    public void testAdd() {
        String name = "Муся", tel = "89242141232";

        int expected = 3;

        int result = pb.add(name,  tel);

        assertEquals(expected, result);
    }

    @Test
    public void testfindByNumer() {
        String tel = "89178534232";
        String expected = "Ася";

        String result = pb.findByNumer(tel);

        assertEquals(expected, result);
    }

    @Test
    public void testfindByName() {
       String name = "Ася";
        String expected = "89178534232";

        String result = pb.findByName(name);

        assertEquals(expected, result);
    }

    @Test
    public void testprintAllNames() {
        assertDoesNotThrow(() -> pb.printAllNames());
    }
}
