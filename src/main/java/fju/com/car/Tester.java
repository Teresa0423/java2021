package fju.com.car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args){
        int fee = 30;
        Map<String , Car > carMap = new HashMap<>();

       // SimpleDateFormat sdf = new SimpleDateFormat("Teresa");
       // try{
       //     Date d = sdf.parse("09:10");
       //     System.out.println(d);
       // }catch (ParseException e){
        //    e.printStackTrace();
       // }

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 8);
        cal.set(Calendar.MINUTE, 30);
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
