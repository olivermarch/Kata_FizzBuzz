import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzz {

    @Test
    public void check_that_it_runs_to_a_number(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(100,fizzBuzz.recorreNumeros());
    }
}
