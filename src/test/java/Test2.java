import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test2 {
    @BeforeMethod
    public void setUp(){
        System.out.println("BeforeMethod run");
    }

    @Test
    public void successfulTest() {
        assert 1 == 1;
        System.out.println("Successful test done");
    }

    @Test
    public void notFailedTest() {
        assert (1 != 0);
        System.out.println("Not failed test done");
    }
    @AfterMethod
    public void tearDown (){
        System.out.println("AfterMethod run");
    }
}
