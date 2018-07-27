package cs.com.java.demo2;

import cs.com.kotlinTest.demo2.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Test10 {
    public static void main(String[] args) throws ParseException {

        String id = "330683199204114714";
        String year = id.substring(6, 10);// 截取年
        String month = id.substring(10, 12);// 截取月份
        String day = id.substring(12, 14);// 截取天
        String birthDay=year+"."+month+"."+day;
        System.out.println(birthDay);


    }
}
