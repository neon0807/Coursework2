package task;

import exception.IncorrectArgumentException;
import type.Type;

import java.time.LocalDateTime;

public class DailyTask extends Task {

    public DailyTask(String title, Object o, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super(title, (Type) o, dateTime, description);
    }
    public boolean appearsln() {
        return true;
    }
}
