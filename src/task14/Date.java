package task14;

import java.util.Calendar;

public class Date {
    /*Quyidagi 3ta attribute bor bo’lgan Date klassini yarating:
    yil, oy va kun. 15.05.2020 formatdagi sanani chop etuvchi mehod yarating.
     */

    private int year;
    private int month;
    private int day;
    Calendar calendar=Calendar.getInstance();
    public Date(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;

    }
    public void sana(){
        System.out.println(day + "." + month + "." + year);
    }

    public static void main(String[] args) {
        Date date=new Date(15,05,2020);
        date.sana();
    }
}
