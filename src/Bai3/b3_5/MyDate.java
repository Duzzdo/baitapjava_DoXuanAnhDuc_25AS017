package Bai3.b3_5;

public class MyDate {
    private int year, month, day;
    public static final String[] MONTHS =
            {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    public static final String[] DAYS =
            {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public static final int[] DAYS_IN_MONTHS =
            {31,28,31,30,31,30,31,31,30,31,30,31};

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public static boolean isLeapYear(int year) {
        return (year%4==0 && year%100!=0) || year%400==0;
    }

    public static boolean isValidDate(int y,int m,int d){
        if(m<1||m>12||d<1) return false;
        int max = DAYS_IN_MONTHS[m-1];
        if(m==2 && isLeapYear(y)) max=29;
        return d<=max;
    }

    public void setDate(int y,int m,int d){
        if(!isValidDate(y,m,d)) throw new IllegalArgumentException();
        year=y; month=m; day=d;
    }

    public MyDate nextDay() {
        day++;
        int max = DAYS_IN_MONTHS[month-1];
        if(month==2 && isLeapYear(year)) max=29;
        if(day>max){ day=1; month++; }
        if(month>12){ month=1; year++; }
        return this;
    }

    @Override
    public String toString() {
        return day + " " + MONTHS[month-1] + " " + year;
    }
}
