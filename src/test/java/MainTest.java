import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void name() throws Exception {
        String s = Main.lol();
        Assert.assertEquals("lol", s);
    }
}