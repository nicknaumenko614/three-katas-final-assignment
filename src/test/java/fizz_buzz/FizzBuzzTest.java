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
    public void createFizzBuzzClass() {
        FizzBuzz underTest = new FizzBuzz();
    }

    @Test
    public void whenGiven1FizzBuzzSays1() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(1);
        assertThat(spokenWord).isEqualTo("1");
    }

    @Test
    public void whenGiven2FizzBuzzSays2() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(2);
        assertThat(spokenWord).isEqualTo("2");
    }

    @Test
    public void whenGiven3FizzBuzzSays3() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(3;
        assertThat(spokenWord).isEqualTo("Fizz");
    }

    @Test
    public void whenGiven4FizzBuzzSays4() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(4);
        assertThat(spokenWord).isEqualTo("4");
    }

    @Test
    public void whenGiven5FizzBuzzSays5() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(5);
        assertThat(spokenWord).isEqualTo("Buzz");
    }

    @Test
    public void whenGiven6FizzBuzzSays6() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(6);
        assertThat(spokenWord).isEqualTo("Fizz");
    }

    @Test
    public void whenGiven7FizzBuzzSays7() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(7);
        assertThat(spokenWord).isEqualTo("7");
    }

    @Test
    public void whenGiven2FizzBuzzSays2() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(2);
        assertThat(spokenWord).isEqualTo("2");
    }

}


