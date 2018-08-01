import com.willjsporter.MyResource;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;


public class MyResourceTest {

    @Test
    public void shouldReturnTheRightThing() {
        MyResource testMyResource = new MyResource();
        assertEquals(testMyResource.getIt(),"Got it!");
    }
}
