package parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {

        //JAVA8
        Instant instant = Instant.now();
        System.out.println(instant);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println( dateTimeFormatter.format(now) );

        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other = LocalDateTime.of(2019, 9,10,0,11,12);
        System.out.println(other);
        System.out.println(dateTimeFormatter.format(other));

//        JAVA7();

    }

    private static void JAVA7() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        try {
            System.out.println( sdf.parse("2019/08/08 16:16:16"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 2);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 5);
        System.out.println(calendar.getTime());
    }
}
