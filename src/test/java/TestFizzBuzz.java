


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzz {

    @Test
    public void count(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(1,fizzBuzz.next());
    }

}
