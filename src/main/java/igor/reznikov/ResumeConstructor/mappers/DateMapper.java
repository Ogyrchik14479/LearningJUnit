package igor.reznikov.ResumeConstructor.mappers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMapper {

    private final String PATTERN = "dd.MM.yyyy";

    public String asString(Date date) {
        return date != null ? new SimpleDateFormat(PATTERN).format(date) : null;
    }

    public Date asDate(String date) {
        try {
            return date != null ? new SimpleDateFormat(PATTERN).parse(date) : null;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
