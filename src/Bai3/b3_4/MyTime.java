package Bai3.b3_4;

public class MyTime {
    private int hour, minute, second;

    public MyTime() { this(0,0,0); }
    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour; this.minute = minute; this.second = second;
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    public MyTime nextSecond() {
        second++;
        if (second == 60) { second = 0; minute++; }
        if (minute == 60) { minute = 0; hour = (hour + 1) % 24; }
        return this;
    }

    public MyTime previousSecond() {
        second--;
        if (second < 0) { second = 59; minute--; }
        if (minute < 0) { minute = 59; hour = (hour + 23) % 24; }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
