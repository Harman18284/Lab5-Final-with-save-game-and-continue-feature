import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SerializableTestRunner {
    public static void main(String[] args) {

//        SerializableTest1 obj = new SerializableTest1();
        Result result= JUnitCore.runClasses(SerializableTestSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
