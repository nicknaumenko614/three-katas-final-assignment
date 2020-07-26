package babysitter;

public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        return 0;
    }


    protected static int convertTime(int inputTime) {
        if (inputTime <= 24 && inputTime >= 17) {
            return inputTime - 17;
        } else {
            return inputTime + 7;
        }
    }

    protected int calculateHoursWorkedAfterMidnight(int endingHour) {
        endingHour = convertTime((endingHour));
        int midnight = convertTime(24);

        if (endingHour > midnight) {
            return endingHour - midnight;
        } else {
            return 0;
        }

    }
}
