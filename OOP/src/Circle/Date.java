package Circle;

public class Date {
    private int _day;
    private int _month;
    private int _year;

    public Date(int day, int month, int year){
        setDate(day, month, year);
    }

    public int getDay(){return _day;}

    public int getMonth(){return _month;}

    public int getYear() {return _year;}

    public void setDay(int day) { _day = day; }

    public void setMonth(int month) { _month = month; }

    public void setYear(int year) { _year = year; }

    public void setDate(int day, int month, int year){
        if(day >= 0 && day <=31)
            _day = day;
        else
            _day = 0;

        if(month >= 0 && month <=12)
            _month = month;
        else
            _month = 0;
        if(year >= 1900 && year <=9999)
            _year = year;
        else
            _year = 0;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(_day < 10)
            sb.append("0").append(_day);
        else
            sb.append(_day);

        sb.append("/");

        if(_month < 10)
            sb.append("0").append(_month);
        else
            sb.append(_month);

        sb.append("/");

        sb.append(_year);

        return sb.toString();
    }
}