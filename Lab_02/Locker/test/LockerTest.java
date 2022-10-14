import org.junit.Assert;
import org.junit.Test;

public class LockerTest {

    public static void main(String[] args){
        //BISOGNAVA USARE assertTrue or assertFalse!!!
        Locker locker = new Locker();
        Assert.assertEquals(String.valueOf(true),locker.isOpen(),0);
        locker.newComb("pippo");
        locker.lock();
        Assert.assertEquals(String.valueOf(false),locker.isOpen(),0);
        locker.unlock("pippo");
        Assert.assertEquals(String.valueOf(true),locker.isOpen(),0);
    }
}