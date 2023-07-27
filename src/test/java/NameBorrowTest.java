import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameBorrowTest {

    private NameBorrow nameBorrow;

    @BeforeEach
    void setUp() {
        nameBorrow=new NameBorrow();
    }

    @Test
    void fullName() {
        nameBorrow.setFirstName("Jake");
        nameBorrow.setLastName("Collen");
        assertEquals("JAKE COLLEN", nameBorrow.fullName());
    }

    @Test
    void getFirstName() {
        nameBorrow.setFirstName("Mike");
        assertEquals("Mike", nameBorrow.getFirstName());
    }

    @Test
    void getLastName() {
        nameBorrow.setLastName("Likey");
        assertEquals("Likey",nameBorrow.getLastName());
    }
}