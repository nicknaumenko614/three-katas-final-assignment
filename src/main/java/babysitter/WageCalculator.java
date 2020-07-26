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

    public int calculateHoursWorkedBetweenBedtimeAndMidnight(int startingHour, int endingHour, int bedtime) {
        endingHour = convertTime(endingHour);
        startingHour = convertTime(startingHour);
        bedtime = convertTime(bedtime);
        int midnight = convertTime(24);
        if (endingHour <= midnight) {
            return endingHour - bedtime;
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
        return 4;
    }
}
