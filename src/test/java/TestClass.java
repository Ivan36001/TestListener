import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    @TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
    public void annotation() {
        Assert.assertEquals(1, 1);
    }



}
