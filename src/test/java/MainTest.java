import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testReverseString() {
      
        assertEquals("olleh", new Main().reverse("potta_Midhun"));
    }
    @test
    public void testReverseString1() {
        assertEquals("olleh", new Main().reverse("hello"));
    }
    @Test
    public void testReverseString2() {
        assertEquals("olleh", new Main().reverse("potta_Midhun"));
    }
}