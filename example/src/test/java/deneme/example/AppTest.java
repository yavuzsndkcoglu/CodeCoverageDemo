package deneme.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AppTest 
{

    @Test
    public void testNameTry() {

       App obj = new App();
       assertEquals("Hello tester", obj.getMessage("tester"));

    }

}
