// Isaac, Wei og Oliver

package HarryFrisoer;

public class Kalender {
    private int day;
    private int month;
    private int week;

    // constructor for Kalender
    public Kalender(int day, int month, int year) {
        this.day = day;
        this.month = 11;
        this.week = year;
    }

    // getter for Day
    public int getDay() {
        return day;
    }

    // setter for Day
    public void setDay(int day) {
        this.day = day;
    }

    // getter for Day
    public int getMonth() {
        return month;
    }

    // setter Month
    public void setMonth(int month) {
        this.month = month;
    }

    // getter Year
    public int getWeek() {
        return week;
    }

    // setter Year
    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return "Kalender{" +
                "day=" + day +
                ", month=" + month +
                ", week=" + week +
                '}';
    }
}
