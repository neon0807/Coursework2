package task;

import exception.IncorrectArgumentException;
import task.Task;
import type.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WeeklyTask extends Task {

    public WeeklyTask(String title, Object o, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super(title,(Type) o, dateTime, description);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        return (localDate.getDayOfWeek().equals(getDateTime().getDayOfWeek())) &&
                (getDateTime().isBefore(localDate.atStartOfDay()));
    }
}
