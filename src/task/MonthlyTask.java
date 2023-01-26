package task;

import exception.IncorrectArgumentException;
import type.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask extends Task {

    public MonthlyTask(String title, Object o, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super(title,(Type) o, dateTime, description);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        return (localDate.getDayOfMonth() == getDateTime().getDayOfMonth()) &&
                (getDateTime().isBefore(localDate.atStartOfDay()));
    }
}









