import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExceptionTestRunner {
    public static void main(String[] args) {

//        SerializableTest1 obj = new SerializableTest1();
        Result result= JUnitCore.runClasses(ExceptionTestSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
