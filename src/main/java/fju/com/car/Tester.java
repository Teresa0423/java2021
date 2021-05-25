package fju.com.car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args){

        SimpleDateFormat sdf = new SimpleDateFormat("Teresa");
        try{
            Date d = sdf.parse("09:10");
            System.out.println(d);
        }catch (ParseException e){
            e.printStackTrace();
        }

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        Car c1 = new Car("123");
        Car c2 = new Car("456","08:30");
        System.out.println(c1.enter);

        Date now = new Date();
        now.getTime();
        long dis = now.getTime() - c1.enter.getTime();
        System.out.println(dis);
    }
}
