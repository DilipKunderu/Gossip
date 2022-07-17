import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitiatorTest {

    @Test
    void sayMyName() {
        Initiator initiator = new Initiator();
        initiator.sayMyName();
    }
}