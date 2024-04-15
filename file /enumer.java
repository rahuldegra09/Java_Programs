import java.util.*;
class enumer{
    public static void main(String args[])
    {
        enum WEEKDAY{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};
        WEEKDAY day;
        for(WEEKDAY m:WEEKDAY.values())
        System.out.print(m+"  ");
    }
}