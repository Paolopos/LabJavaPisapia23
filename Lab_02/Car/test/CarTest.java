import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    public static void main() {

        Car car = new Car();
        car.addGas(90);
        car.drive(5);

        Assert.assertEquals(84,car.getGas(),0);

    }
}