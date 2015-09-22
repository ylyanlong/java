package com.yl.date;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2015/7/14.
 */
public class DateT1 {
    public static void main(String[] args){
        System.out.println("curTime:" + System.currentTimeMillis() );
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        System.out.println("ts: " + ts.getTime());
        Date mydate = new Date();
        System.out.println("datetime str: " + mydate.toString() );
        System.out.println("milliseconds: " + mydate.getTime() );

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = dateFormat.format(mydate);
        String dateStrSec = dateStr.substring(0, 17) + "00";
        System.out.println("dateStrSec: " + dateStrSec);
        System.out.println(dateStr);

        Long time = 1442815200L;
        Date mydate2 = new Date(time * 1000);
        System.out.println("mydate2: " + dateFormat.format(mydate2));

        String dateStr1 = "2015-09-17 12:30:00";
        String dateStr2 = "2015-09-17 12:30:00";
        String dateStr3 = "2015-09-22 17:20:00";
        try {
            Date dateFromStr1 = dateFormat.parse(dateStr1);
            Date dateFromStr2 = dateFormat.parse(dateStr2);
            Date dateFromStr3 = dateFormat.parse(dateStr3);
            System.out.println("dateFromStr1: " + dateFromStr1.toString());
            System.out.println("dateFromStr2: " + dateFromStr2);
            System.out.println("dateFromStr3: " + dateFromStr3.getTime());

            if(dateFromStr1.after(dateFromStr2)){
                System.out.println("dateFromStr1 after dateFromStr2");
            }
            else {
                System.out.println("dateFromStr2 after dateFromStr1");
            }

            if(dateFromStr1.before(dateFromStr2) ){
                System.out.println("dateFromStr1 before dateFromStr2");
            }
            else {
                System.out.println("dateFromStr1 not before dateFromStr2");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MINUTE, -20);
        Date date5 = cal.getTime();
        System.out.println("time5: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date5));

    }// end main
}
