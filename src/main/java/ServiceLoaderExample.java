import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import java.util.ServiceLoader;


public class ServiceLoaderExample {



    public static void main(String [] args) {
        final ServiceLoader<ITestListener> services = ServiceLoader.load(ITestListener.class);
        for (ITestListener service : services) {

            service.onStart(null);

            ITestResult result = Reporter.getCurrentTestResult();
            service.onTestSuccess( result);


            service.onFinish(null);
        }

    }

}
