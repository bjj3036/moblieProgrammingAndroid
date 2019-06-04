package kr.hs.dgsw.libraryproject.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String longToString(long time) {
        return longToString(time, "yyyy-MM-dd");
    }

    public static String longToString(long time, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date(time));
    }
}
