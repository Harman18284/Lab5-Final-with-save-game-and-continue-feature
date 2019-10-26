import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class VultureExceptionTest {

    @Test(expected = VultureBiteException.class)
    public void testfunction() throws VultureBiteException {
        Vulture s = new Vulture(1,1,"Snake");
        s.throwexception();
    }
}
