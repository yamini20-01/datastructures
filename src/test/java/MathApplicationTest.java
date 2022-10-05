import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

public class MathApplicationTest {

    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calcService1;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this); //without this you will get NPE
    }

    @Test
    public void testAdd() {
        //add the behavior of calc service to add two numbers
        Mockito.when(calcService1.add(10.0, 20.0)).thenReturn(30.00);

        //test the add functionality
        Assertions.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
    }

}
