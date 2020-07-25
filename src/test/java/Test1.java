import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;




public class Test1 {
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
    public void failedTest() {
        assert (1 == 0);
        System.out.println("Failed test done");
    }
    @AfterMethod
    public void tearDown (){
        System.out.println("AfterMethod run");
    }
}
