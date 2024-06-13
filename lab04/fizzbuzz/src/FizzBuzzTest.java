import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testFizz() {
        assertEquals("Fizz", FizzBuzz.convert(3));
    }
}