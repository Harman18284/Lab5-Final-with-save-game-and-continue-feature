import org.junit.Test;

public class GameWinnerExceptionTest {

    @Test(expected = GameWinnerException.class)
    public void testfunction() throws GameWinnerException {
        Main x = new Main();
        x.throwgamewinnerexception();
    }
}
