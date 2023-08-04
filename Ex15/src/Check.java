import java.time.DateTimeException;
import java.time.LocalDate;

public class Check {

    public static void isDate(String s) throws DateTimeException {

        try {
            LocalDate.parse(s);
        }
        catch (DateTimeException e) {
            throw new DateTimeException("Ngay khong hop le");
        }
    }
}
