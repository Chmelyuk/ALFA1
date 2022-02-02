package work22;

import java.text.SimpleDateFormat;

import java.util.Date;
public class task22 {
    public static void main (String[]args) {
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD'at'HH:MM:SS z");
        Date date = new Date(System.currentTimeMillis()) ;
        System.out.println(formatter.format(date));
    }
}

