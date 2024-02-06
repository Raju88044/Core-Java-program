public class Enum_example {
    
    public static void main(String[] args) {
        System.out.println("In main");

        WeekDays[] days = WeekDays.values();
        System.out.println(days[0].name());
        for(WeekDays day : days) {
            System.out.println(day + ":" + day.getDays());
        }
    }
}

enum WeekDays
{  

    Day1("Monday"),day2("TUESDAY"),day3("WEDNESDAY"),day4("THURSDAY"),
    day5("FRIDAY"),day6("SATURDAY"), day7("SUNDAY");

    private WeekDays(String days) {
        this.days = days;
    }
    public String getDays() {
        return days;
    }
    public void setDays(String days) {
        this.days = days;
    }
    private String days;
   //we can't declare public constructor for enum

}
