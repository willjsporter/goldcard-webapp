import com.willjsporter.MyResource;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class MyResourceTest {

    @Test
    public void shouldReturnTheRightThing() {
        MyResource testMyResource = new MyResource();
        assertThat(testMyResource.getClass(), is(class com.willjsporter.MyResource));
    }
}
