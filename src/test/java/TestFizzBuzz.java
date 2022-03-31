import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzz {

    @Test
    public void check_that_it_runs_to_a_number(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(100,fizzBuzz.recorreNumeros());
    }

    @Test
    public void check_that_it_print_a_string_with_fizz_when_the_number_is_3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int n = 3;
        assertEquals("Fizz",fizzBuzz.printFizz(n));
    }
}
