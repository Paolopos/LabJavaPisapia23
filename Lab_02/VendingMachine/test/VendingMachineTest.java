import org.junit.Assert;
import org.junit.Test;
public class VendingMachineTest {

  public static void main(String[] argv){
      VendingMachine vendita = new VendingMachine();
      vendita.addCans(5);
      vendita.addTokens(5);
      vendita.takeCan();
      vendita.takeTokens();
      Assert.assertEquals(4, vendita.getNumberOfCans(), 0);
      Assert.assertEquals(4, vendita.getNumberOfTokens(), 0);
  }
  public void testSecondConstructor(){
      VendingMachine vendita2 = new VendingMachine(5);
      vendita2.addTokens(1);
      vendita2.takeCan();
      vendita2.takeTokens();
      Assert.assertEquals(4, vendita2.getNumberOfCans(), 0);
      Assert.assertEquals(0, vendita2.getNumberOfTokens(), 0);
  }


}