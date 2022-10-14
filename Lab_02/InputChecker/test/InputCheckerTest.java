import org.junit.Assert;
import org.junit.Test;

public class InputCheckerTest {

    public static void test(){

        InputChecker checker = new InputChecker();
        Assert.assertEquals("OK",  checker.checkInput("S"),0);
        Assert.assertEquals("Fine",  checker.checkInput("No"),0);
        Assert.assertEquals("dato non corretto!",  checker.checkInput("pippo"),0);
    }
}