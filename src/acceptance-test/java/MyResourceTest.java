import com.willjsporter.MyResource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MyResourceTest {

    @Test
    void shouldReturnTheRightThing() {
        MyResource testMyResource = new MyResource();
        assertEquals(testMyResource.getIt(),"Got it!");
    }
}
