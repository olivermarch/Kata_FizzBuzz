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
    @Test
    public void check_that_it_print_a_string_with_buzz_when_the_number_is_5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int n = 5;
        assertEquals("Buzz",fizzBuzz.printBuzz(n));
    }

    @Test
    public void check_that_it_print_a_string_with_fizz_when_it_is_multiply_of_3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz",fizzBuzz.printFizzWhenIsMultiply3(9));
    }

    @Test
    public void check_that_it_print_a_string_with_fizz_when_it_is_multiply_of_5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz",fizzBuzz.printFizzWhenIsMultiply5(25));
    }


}
