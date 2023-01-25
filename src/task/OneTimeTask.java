package task;

import exception.IncorrectArgumentException;
import type.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task {

    public OneTimeTask(String title, Object o, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super(title,(Type) o, dateTime, description);
    }
    public boolean appearsln(LocalDate localDate) {
        return localDate.equals(getDateTime());
    }
}
