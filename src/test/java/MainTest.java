import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @test
    public void testReverseString1() {
        assertEquals("olleh", new Main().reverse("hello"));
    }
}