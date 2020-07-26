package babysitter;


public class WageCalculator {

    private static final int BEFORE_BED_TIME_PAY = 12;
    private static final int DURING_BEDTIME_PAY_RATE = 8;
    private static final int AFTER_MIDNIGHT_PAY_RATE = 16;

    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        int wageBeforeBedTime = (calculateHoursWorkedBetweenStartingHourAndBedtime(startingHour, endingHour, bedtime)) * BEFORE_BED_TIME_PAY;
        int wageDuringBedTime = (calculateHoursWorkedBetweenBedtimeAndMidnight(startingHour, endingHour, bedtime)) * DURING_BEDTIME_PAY_RATE;
        int wageAfterMidnight = (calculateHoursWorkedAfterMidnight(endingHour)) * AFTER_MIDNIGHT_PAY_RATE;
        return (wageBeforeBedTime + wageDuringBedTime + wageAfterMidnight);
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

    public int calculateHoursWorkedBetweenBedtimeAndMidnight(int startingHour, int endingHour, int bedtime) {
        endingHour = convertTime(endingHour);
        startingHour = convertTime(startingHour);
        bedtime = convertTime(bedtime);
        int midnight = convertTime(24);
        if (endingHour <= midnight) {
            if (endingHour <= bedtime) {
                return 0;
            } else {
                return endingHour - bedtime;
            }
        } else {
            if (startingHour < bedtime) {
                return midnight - bedtime;
            } else {
                int workedHours = midnight - startingHour;
                if (workedHours < 0) {
                    return 0;
                } else {
                    return workedHours;
                }
            }
        }
    }

    public int calculateHoursWorkedBetweenStartingHourAndBedtime(int startingHour, int endingHour, int bedtime) {
        endingHour = convertTime(endingHour);
        startingHour = convertTime(startingHour);
        bedtime = convertTime(bedtime);

        if (bedtime <= startingHour) {
            return 0;
        } else {
            if (bedtime > endingHour) {
                return endingHour - startingHour;
            } else {
                return bedtime - startingHour;
            }
        }
    }

    public boolean isStartingHourBeforeEndingHour(int startingHour, int endingHour) {
        endingHour = convertTime(endingHour);
        startingHour = convertTime(startingHour);

        if (startingHour < endingHour) {
            return true;
        } else {
            return false;
        }

    }
}
