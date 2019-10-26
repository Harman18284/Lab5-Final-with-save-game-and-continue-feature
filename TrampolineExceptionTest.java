import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class TrampolineExceptionTest {

    @Test(expected = TrampolineException.class)
    public void testfunction() throws TrampolineException {
        Trampoline s = new Trampoline(1,1,"Snake");
        s.throwexception();
    }
}
