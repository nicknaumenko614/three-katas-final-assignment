package babysitter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BabySitterTest {

    private WageCalculator underTest;

    @BeforeEach
    public void setUp() {
        underTest = new WageCalculator();
    }

    @Test
    public void oneHourPreBedTimeShouldPay12() {
        int wage = underTest.calculateShiftWage(17, 18, 20);
        assertThat(wage).isEqualTo(12);
    }

    @Test
    public void canConvertTimeBeforeMidnight() {
        int actualResult = underTest.convertTime(20);
        assertThat(actualResult).isEqualTo(3);
    }

    @Test
    public void canConvertTimeAfterMidnight() {
        int actualResult = underTest.convertTime(2);
        assertThat(actualResult).isEqualTo(9);

        actualResult = underTest.convertTime(24);
        assertThat(actualResult).isEqualTo(7);
    }

    @Test
    public void canCalculateHoursWorkedAfterMidnight() {
        int actualResult = underTest.calculateHoursWorkedAfterMidnight(3);
        assertThat(actualResult).isEqualTo(3);

        actualResult = underTest.calculateHoursWorkedAfterMidnight(23);
        assertThat(actualResult).isEqualTo(0);
    }

    @Test
    public void canCalculateHoursWorkedBetweenBedtimeAndMidnight() {
        int actualResult = underTest.calculateHoursWorkedBetweenBedtimeAndMidnight(18, 2, 20);
        assertThat(actualResult).isEqualTo(4);

        actualResult = underTest.calculateHoursWorkedBetweenBedtimeAndMidnight(21, 2, 20);
        assertThat(actualResult).isEqualTo(3);

        actualResult = underTest.calculateHoursWorkedBetweenBedtimeAndMidnight(24, 2, 20);
        assertThat(actualResult).isEqualTo(0);

        actualResult = underTest.calculateHoursWorkedBetweenBedtimeAndMidnight(1, 2, 20);
        assertThat(actualResult).isEqualTo(0);
    }

    @Test
    public void canCalculateHoursWorkedBetweenStartingHourAndBedtime () {
        int actualResult = underTest.calculateHoursWorkedBetweenStartingHourAndBedtime(17, 2, 21);
        assertThat(actualResult).isEqualTo(4);

        actualResult = underTest.calculateHoursWorkedBetweenStartingHourAndBedtime(21, 2, 21);
        assertThat(actualResult).isEqualTo(0);
    }
}
