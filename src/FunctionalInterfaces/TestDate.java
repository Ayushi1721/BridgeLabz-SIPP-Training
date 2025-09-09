package FunctionalInterfaces;
import java.text.SimpleDateFormat;
import java.util.Date;

interface DateUtils {
    static String format(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}

public class TestDate {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(DateUtils.format(now, "dd/MM/yyyy"));
        System.out.println(DateUtils.format(now, "yyyy-MM-dd HH:mm:ss"));
    }
}

