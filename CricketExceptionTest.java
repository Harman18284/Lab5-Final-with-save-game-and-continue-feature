import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class CricketExceptionTest {

    @Test(expected = CricketBiteException.class)
    public void testfunction() throws CricketBiteException {
        Cricket s = new Cricket(1,1,"Snake");
        s.throwexception();
    }
}
