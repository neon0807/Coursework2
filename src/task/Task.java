package task;

import exception.IncorrectArgumentException;
import type.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task  {

    private static int idGenerator;
    private final Type type;
    private String title;

    private int id=1;
    private final LocalDateTime dateTime;
    private String description;


    public int getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public void setTitle(String title) throws IncorrectArgumentException {
        if (title == null || title.isBlank()) {
            System.out.println("Введено пустое поле");
            throw new IncorrectArgumentException();
      }
        else this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDescription(String description) throws IncorrectArgumentException{
        if (description == null || description.isBlank()) {
            System.out.println("Введено пустое поле");
            throw new IncorrectArgumentException();
        }else this.description = description;
    }

    public abstract boolean appearsln(LocalDate localDate);


    public Task(String title, Type type, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        idGenerator++;
        this.title = title;
        this.type = type;
        this.id = idGenerator++;

        if (dateTime.isBefore(LocalDate.now().atStartOfDay())){
            System.out.println("Введена не корктная дата");
            throw new IncorrectArgumentException ();
        } else this.dateTime = dateTime;

        this.description = description;

    }


    @Override
    public String toString() {
        return "Задача: {" +
                ", Название - " + title + '\'' +
                ", Тип - " + type +
                ", Дата и время - " + dateTime +
                ", Описание - '" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && type == task.type && title.equals(task.title) && dateTime.equals(task.dateTime) && description.equals(task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, title, id, dateTime, description);
    }


}


