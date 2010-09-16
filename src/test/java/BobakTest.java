import org.junit.Assert;
import org.junit.Test;

/**
 * @author tomekk
 * @since 2010-09-16, 18:26:08
 */
public class BobakTest {

    @Test
    public void shouldSayHelloIfAskedPolitely() {
        String response = new Bobak().sayHello();
        Assert.assertEquals(Bobak.HELLO_BOBAK,response);
    }
}
