import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}
