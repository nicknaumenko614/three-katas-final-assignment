package fizz_buzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Here are the rules for this kata:
 * <p>
 * -Write a method that takes an integer and returns a string. This represents the act of saying a number.
 * -The string should be the numerical characters that represent the value of the integer that was passed, EXCEPT:
 * -When the integer passed is a multiple of 3, the method should say Fizz.
 * -When the integer passed is a multiple of 5, the method should say Buzz.
 */

public class FizzBuzzTest {

    @Test
    public void whenGiven3FizzBuzzSaysFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(3);
        assertThat(spokenWord).isEqualTo("Fizz");
    }

    @Test
    public void whenGiven5FizzBuzzSaysBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(5);
        assertThat(spokenWord).isEqualTo("Buzz");
    }

    @Test
    public void whenGiven15FizzBuzzSaysFizzBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(15);
        assertThat(spokenWord).isEqualTo("FizzBuzz");
    }

    @Test
    public void whenGiven1FizzBuzzSays1() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(1);
        assertThat(spokenWord).isEqualTo("1");
    }


}


