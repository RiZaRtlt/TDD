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
        String name1 = "Гриша", tel1 = "891785858585";
        String name2 = "Ася", tel2 = "89178534232";
        String name3 = "Муся", tel3 = "89242141232";

        int expected = 3;

        pb.add(name1,  tel1);
        pb.add(name2,  tel2);
        int result = pb.add(name3,  tel3);

        assertEquals(expected, result);
    }

    @Test
    public void testfindByNumer() {
        String tel = "89178534232";
        String expected = "Ася";

        String result = pb.findByNumer(tel);

        assertEquals(expected, result);
    }
}
