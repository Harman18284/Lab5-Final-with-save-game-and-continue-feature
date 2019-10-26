import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class SnakeExceptionTest {

    @Test(expected = SnakeBiteException.class)
    public void testfunction() throws SnakeBiteException {
        Snake s = new Snake(1,1,"Snake");
        s.throwexception();
    }
}
