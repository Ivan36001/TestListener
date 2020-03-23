import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.google.auto.service.AutoService;


@AutoService(ITestListener.class)
public class Listener implements ITestListener {



    @Override
    public void onFinish(ITestContext arg0) {
        System.out.println("----------FINISH ALL----------------\n\n");

    }

    @Override
    public void onStart(ITestContext arg0) {
        System.out.println("----------Start ALL----------------\n\n");

    }
    @Override
    public void onTestSuccess(ITestResult res) {
        try {
            Class c=Class.forName("TestClass");
            System.out.println(c.getMethod("annotation").getAnnotation(TestMethodInfo.class));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }



    }



}

