package task;

import exception.IncorrectArgumentException;
import task.Task;
import type.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task {

    public YearlyTask(String title, Object o, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super(title,(Type) o, dateTime, description);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        return (localDate.getDayOfYear() == getDateTime().getDayOfYear()) &&
                (getDateTime().isBefore(localDate.atStartOfDay()));
    }
}
