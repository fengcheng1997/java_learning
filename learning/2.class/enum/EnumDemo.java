//import java.util.Arrays;
//
//public class EnumDemo {
//    public static void main(String[] args){
////        Day[] days = new Dya[]{Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};
//        Day[] days = Day.values();
//        Day day = Day.valueOf("MONDAY");
//        System.out.println("days:" + days[0]);
//        System.out.println("days:" + Arrays.toString(days));
//        System.out.println("day:" + day);
//    }
//
///*  days:MONDAY
//    days:[MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]
//    day:MONDAY
//*/
//}
//
//
//enum Day {
//    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//}

public class EnumDemo {
    public static void main (String[] args) {
        Day[] days =new Day[]{Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};
        for (Day day:days){
            System.out.println("day:" + day.getDeclaringClass());
            System.out.println("ordinal():" + day.ordinal());
            System.out.println("class:" + day.getClass().getName());
        }


        System.out.println("-------------------------------------");

        //name()
        System.out.println("days[0].name():"+days[0].name());
        System.out.println("days[1].name():"+days[1].name());
        System.out.println("days[2].name():"+days[2].name());
        System.out.println("days[3].name():"+days[3].name());

        System.out.println("-------------------------------------");

        System.out.println("days[0].toString():"+days[0].toString());
        System.out.println("days[1].toString():"+days[1].toString());
        System.out.println("days[2].toString():"+days[2].toString());
        System.out.println("days[3].toString():"+days[3].toString());

        System.out.println("-------------------------------------");

        Day d=Enum.valueOf(Day.class,days[0].name());
        Day d2=Day.valueOf(Day.class,days[0].name());
        System.out.println("d:"+d);
        System.out.println("d2:"+d2);
    }
    /**
     执行结果:
     day[0].ordinal():0
     day[1].ordinal():1
     day[2].ordinal():2
     day[3].ordinal():3
     day[4].ordinal():4
     day[5].ordinal():5
     day[6].ordinal():6
     -------------------------------------
     days[0].compareTo(days[1]):-1
     days[0].compareTo(days[1]):-2
     clazz:class com.zejian.enumdemo.Day
     -------------------------------------
     days[0].name():MONDAY
     days[1].name():TUESDAY
     days[2].name():WEDNESDAY
     days[3].name():THURSDAY
     -------------------------------------
     days[0].toString():MONDAY
     days[1].toString():TUESDAY
     days[2].toString():WEDNESDAY
     days[3].toString():THURSDAY
     -------------------------------------
     d:MONDAY
     d2:MONDAY
     */

}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}