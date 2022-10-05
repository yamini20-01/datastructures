import general.Circle;
import general.Shape.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AreaTest {


    @Test
    public void testArea() {

        Shape shape = Mockito.mock(Circle.class);
        Mockito.when(shape.area()).thenReturn(10);
        Assertions.assertEquals(10, shape.area());
    }

}
