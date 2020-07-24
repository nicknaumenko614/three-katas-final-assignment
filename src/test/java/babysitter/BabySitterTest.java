package babysitter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BabySitterTest {


@Test
public void convertTimeShouldMake17HoursZeroHours(){
    WageCalculator underTest = new WageCalculator();
    assertEquals(0, underTest.convertTime(17));

}
















//    @Test
//    public void oneHourPreBedTimeShouldPay12() {
//        WageCalculator underTest = new WageCalculator();
//        int wage = underTest.calculateShiftWage(17, 18, 20);
//        assertThat(wage).isEqualTo(12);
//    }
}
